package json;

import domain.*;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;
import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonException;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonValue;
import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class LeerlingListReader implements MessageBodyReader<List<Leerling>> {

    @Override
    public boolean isReadable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        if (!List.class.isAssignableFrom(type)) {
            return false;
        }

        if (genericType instanceof ParameterizedType) {
            Type[] arguments = ((ParameterizedType) genericType).getActualTypeArguments();
            return arguments.length == 1 && arguments[0].equals(Leerling.class);
        } else {
            return false;
        }
    }

    @Override
    public List<Leerling> readFrom(Class<List<Leerling>> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, String> httpHeaders, InputStream entityStream) throws IOException, WebApplicationException {
        try (JsonReader in = Json.createReader(entityStream)) {
            JsonArray jsonUsers = in.readArray();
            List<Leerling> leerlingen = new ArrayList<>();
            
            for (JsonObject jsonUser: jsonUsers.getValuesAs(JsonObject.class)) {
                
                Leerling leerling = new Leerling();
                String naam = jsonUser.getString("naam", null);
                String nummer = jsonUser.getString("nummer", null);
//                Verkeerstechniek VT = (Verkeerstechniek) jsonUser.getJsonObject("VT"); 
//                Rijtechniek RT = (Rijtechniek) jsonUser.getJsonObject("RT"); 
//                Hoofdscherm hoofdscherm = (Hoofdscherm) jsonUser.getJsonObject("hoofdscherm"); 
//                
//
//                for (JsonValue eva : jsonUser.getJsonArray("evaluaties")) {
//                    leerling.getEvaluaties().add((Evaluatie) eva);
//                }
//                
//                for (JsonValue att : jsonUser.getJsonArray("attitude")) {
//                    leerling.getAttitude().add(att.toString());
//                }
//                
//                for (JsonValue opm : jsonUser.getJsonArray("opmerkingen")) {
//                    leerling.getOpmerkingen().add( opm.toString());
//                }
                
                leerling.setnaam(naam);
                leerling.setNummer(nummer);
//                leerling.setRT(RT);
//                leerling.setVT(VT);
//                leerling.setHoofdscherm(hoofdscherm);
                leerlingen.add(leerling);
            }
            
            return leerlingen;
        } catch (JsonException | ClassCastException ex) {
            return new ArrayList();
        }
    }
}
