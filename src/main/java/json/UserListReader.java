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
import javax.ws.rs.Consumes;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

@Provider
@Consumes(MediaType.APPLICATION_JSON)
public class UserListReader implements MessageBodyReader<List<Leerling>> {

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
                String username = jsonUser.getString("username", null);
                String fullName = jsonUser.getString("fullName", null);
                Leerling leerling = new Leerling();
//                leerling.setUsername(username);
//                leerling.setFullName(fullName);
//                leerling.add(leerling);
            }
            return null;//leerling;
        } catch (JsonException | ClassCastException ex) {
            return new ArrayList();
        }
    }
}
