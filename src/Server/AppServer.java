package Server;
import com.sun.net.httpserver.HttpExchange;
import com.sun.net.httpserver.HttpServer;
import framework.Dispatcher;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.util.concurrent.Executors;




public class AppServer {
    public static void main(String [] args) throws IOException{


        HttpServer server = HttpServer.create(new InetSocketAddress(1010),0);
        server.setExecutor(Executors.newFixedThreadPool(10));


        server.createContext("/", new Dispatcher());

        server.start();

        System.out.println("MVC is Running At Port 1010");

    }

}
