package framework;

import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.StandardCharsets;

public class ViewRenderer {

    public static void render(HttpExchange exchange,String html) throws IOException{

        byte[] bytes =html.getBytes(StandardCharsets.UTF_8);

        exchange.getResponseHeaders()
                .set("Content- type ", "text/html; charset=UTF_8");

        exchange.sendResponseHeaders(200,bytes.length);

            try (OutputStream os = exchange.getResponseBody()){
                os.write(bytes);
            }
    }
}
