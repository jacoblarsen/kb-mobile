package dk.kb.dis.mobileGateway.restapi;

// Jersey imports
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.spi.container.servlet.ServletContainer;

@Path("/aleph")
public class AlephBindings{
    
    @GET
    @Path("/status")
    @Produces(value=MediaType.TEXT_PLAIN)
    public String alephStatus() {
        return "Status message from Aleph";
    }
    
    
    @GET
    @Path("/update")
    @Produces(value=MediaType.TEXT_PLAIN)
    public String alephUpdate() {
        return "Alpeh was updated";
    }
    
}

