package dk.kb.dis.mobileGateway.restapi;

// Jersey imports
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.spi.container.servlet.ServletContainer;

@Path("/kbdk")
public class KbdkBindings{
    
    @GET
    @Path("/open")
    @Produces(value=MediaType.APPLICATION_JSON)
    public String kbdkOpenJson() {
        return "Opening hours from the royal library in Json";
    }
    
    @GET
    @Path("/open")
    @Produces(value=MediaType.TEXT_HTML)
    public String kbdkOpenHtml() {
        return "Opening hours from the royal library in Html";
    }
    
    @GET
    @Path("/open")
    @Produces(value=MediaType.TEXT_PLAIN)
    public String kbdkOpenPlain() {
        return "Opening hours from the royal library in Plain text";
    }
    
    
    @GET
    @Path("/cantina")
    @Produces(value=MediaType.TEXT_PLAIN)
    public String kbdkCantina() {
        return "Today we serve capers";
    }
    
}

