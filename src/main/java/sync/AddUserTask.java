package sync;


import json.UserWriter;
import domain.*;
import javafx.concurrent.Task;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class AddUserTask extends Task<Void> {

    private final WebTarget userListResource;
    private final Leerling leerling;
    
    public AddUserTask(Leerling leerling) {
        this.leerling = leerling;
        userListResource = ClientBuilder.newClient()
                .target("https://glassfish-svanimpe.rhcloud.com/reminders/api")
                .path("leerlingen")
                .register(UserWriter.class);
    }
    
    @Override
    protected Void call() throws Exception {
        Response response = userListResource.request().post(Entity.entity(leerling, MediaType.APPLICATION_JSON));
        switch (response.getStatus()) {
            case 201:
                return null;
            case 400:
                throw new Exception();
            default:
                throw new Exception();
        }
    }
}
