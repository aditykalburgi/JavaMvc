package framework;
import com.sun.net.httpserver.HttpExchange;
import java.io.IOException;
public interface Controller {
         void handle(HttpExchange exchange) throws IOException;

}
