package org.example;

import java.net.InetSocketAddress;
import com.sun.net.httpserver.HttpServer;
import java.io.IOException;
import java.util.concurrent.Executors;

public class Main {
    public static void main(String[] args) throws IOException {
        try{
            HttpServer httpserver = HttpServer.create(new InetSocketAddress("localhost", 8004),0);
            httpserver.createContext("/", new Server());
//            test
            httpserver.setExecutor(Executors.newSingleThreadExecutor());
            httpserver.start();
            System.out.println( "Terhubung");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}