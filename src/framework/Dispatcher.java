package framework;


import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;
import controller.HomeController;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class Dispatcher implements HttpHandler{

    private Router router = new Router();

    public Dispatcher(){

        router.register("/", new HomeController());

    }

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String path = exchange.getRequestURI().getPath();

        Controller controller = router.getController(path);

        if((controller != null)){
            controller.handle(exchange);
        } else{
            exchange.sendResponseHeaders(404, -1);
        }


    }



}
