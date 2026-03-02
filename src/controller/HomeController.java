package controller;

import framework.Controller;
import framework.ViewRenderer;
import com.sun.net.httpserver.HttpExchange;

import java.io.IOException;
public class HomeController implements Controller{

    @Override
    public void handle(HttpExchange exchange) throws IOException {

        String html ="<html>" +
                "<head><title>Home</title></head>" +
                "<body>" +
                "<h1>Welcome to Custom MVC</h1>" +
                "<p>This is plain Java MVC framework.</p>" +
                "</body>" +
                "</html>";

        ViewRenderer.render(exchange, html);
    }
}
