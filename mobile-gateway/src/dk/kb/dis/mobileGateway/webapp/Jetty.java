package dk.kb.dis.mobileGateway.webapp;

// Jetty imports 
import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletHolder;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.server.handler.ContextHandler;

// Jersey imports
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import com.sun.jersey.spi.container.servlet.ServletContainer;


public class Jetty
{
    // Configuration of the jetty web server 
    final private static int HTTP_PORT = 8080;
    final private static String CONTEXT = "/kbmobile/*";
    
    public static void main(String[] args) throws Exception
    {
        ServletHolder sh = new ServletHolder(ServletContainer.class);
        sh.setInitParameter("com.sun.jersey.config.property.resourceConfigClass", "com.sun.jersey.api.core.PackagesResourceConfig");
        sh.setInitParameter("com.sun.jersey.config.property.packages", "dk.kb.dis.mobileGateway");
        Server server = new Server(HTTP_PORT);
        ServletContextHandler context = new ServletContextHandler(ServletContextHandler.SESSIONS);
        context.addServlet(sh, CONTEXT);
        server.setHandler(context);

        server.start();
        server.join();
    }
}
