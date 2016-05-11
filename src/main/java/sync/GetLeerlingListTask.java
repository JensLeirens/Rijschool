package sync;

import domain.Leerling;
import json.LeerlingListReader;
import java.util.List;
import javafx.concurrent.Task;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

public class GetLeerlingListTask extends Task<List<Leerling>> {

    private final WebTarget LeerlingenListResource;

    public GetLeerlingListTask() {
        LeerlingenListResource = ClientBuilder.newClient()
                .target("http://localhost:8080/Rijschool/")
                .path("leerlingen")
                .register(LeerlingListReader.class);
    }
    
    @Override
    protected List<Leerling> call() throws Exception {
        Response response = LeerlingenListResource.request(MediaType.APPLICATION_JSON).get();
        if (response.getStatus() == 200) {
            List<Leerling> leerlingen = response.readEntity(new GenericType<List<Leerling>>() {});
            return leerlingen;
        } else {
            throw new Exception();
        }
    }
}
