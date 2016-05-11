package json;

import domain.*;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.json.Json;
import javax.json.JsonArrayBuilder;
import javax.json.JsonObjectBuilder;
import javax.json.JsonValue;
import javax.json.JsonWriter;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class LeerlingWriter implements MessageBodyWriter<Leerling> {

    @Override
    public boolean isWriteable(Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return Leerling.class.isAssignableFrom(type);
    }

    @Override
    public long getSize(Leerling leerling, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType) {
        return -1;
    }

    @Override
    public void writeTo(Leerling leerling, Class<?> type, Type genericType, Annotation[] annotations, MediaType mediaType, MultivaluedMap<String, Object> httpHeaders, OutputStream entityStream) throws IOException, WebApplicationException {
        try (JsonWriter out = Json.createWriter(entityStream)) {
            JsonObjectBuilder jsonUser = Json.createObjectBuilder();
            jsonUser.add("naam", leerling.getnaam());
            jsonUser.add("nummer", leerling.getNummer());
            jsonUser.add("VT", (JsonObjectBuilder) leerling.getVT());
            jsonUser.add("RT", (JsonObjectBuilder) leerling.getRT());
            jsonUser.add("hoofdscherm", (JsonObjectBuilder) leerling.getHoofdscherm());
            jsonUser.add("evaluaties", (JsonArrayBuilder) leerling.getEvaluaties());
            jsonUser.add("attitude", (JsonArrayBuilder) leerling.getAttitude());
            jsonUser.add("opmerkingen", (JsonArrayBuilder) leerling.getOpmerkingen());
             

             
              
            out.writeObject(jsonUser.build());
        }
    }
}
