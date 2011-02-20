package dk.kb.dis.alephtools.xserverGateway;


// Jetty imports 
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.server.handler.ContextHandler;




// Jersey imports
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;

import com.sun.jersey.spi.container.servlet.ServletContainer;



// The Java class will be hosted at the URI path "/helloworld"
@Path("/hellojetty")
public class Xserver
{
    // The Java method will process HTTP GET requests
    @GET 
    // The Java method will produce content identified by the MIME Media
    // type "text/plain"
    @Produces(value=MediaType.TEXT_PLAIN)
    public String getClichedMessage() {
        // Return some cliched textual content
        return "Hello World";
    }
    
    
    public static void main(String[] args) throws Exception
    {
        ServletHolder sh = new ServletHolder(ServletContainer.class);
        sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
        sh.setInitParameter("com.sun.jersey.config.property.packages", "dk.kb.dis.alephtools.xserverGateway");
        Server server = new Server(8080);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(sh, "/*");
        server.setHandler(context);

        server.start();
        server.join();
    }
}
