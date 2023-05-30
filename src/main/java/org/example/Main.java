package org.example;

        import com.sun.net.httpserver.HttpServer;

        import java.io.IOException;
        import java.net.InetSocketAddress;
        import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            HttpServer httpserver = HttpServer.create(new InetSocketAddress("localhost", 8004),0);
            httpserver.createContext("/", new Server());
            httpserver.setExecutor(Executors.newSingleThreadExecutor());
            httpserver.start();
            System.out.println("Terhubung...");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
