package sync;

import domain.Leerling;
import json.UserListReader;
import java.util.List;
import javafx.concurrent.Task;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class GetUserListTask extends Task<List<Leerling>> {

    private final WebTarget userListResource;

    public GetUserListTask() {
        userListResource = ClientBuilder.newClient()
                .target("https://glassfish-svanimpe.rhcloud.com/reminders/api")
                .path("users")
                .register(UserListReader.class);
    }
    
    @Override
    protected List<Leerling> call() throws Exception {
        Response response = userListResource.request(MediaType.APPLICATION_JSON).get();
        if (response.getStatus() == 200) {
            List<Leerling> leerlingen = response.readEntity(new GenericType<List<Leerling>>() {});
            return leerlingen;
        } else {
            throw new Exception();
        }
    }
}
