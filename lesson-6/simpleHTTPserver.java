// File: lesson-6/simpleHTTPserver.java
// This code demonstrates a simple HTTP server using the built-in HttpServer class in Java.
// It listens on port 8080 and responds with "Hello, World!" to any incoming HTTP requests.
// The server is created using the HttpServer.create() method, which binds it to a specific port.
// The server context is set up to handle requests at the root path ("/").
// The response is sent with a status code of 200 (OK) and the response body contains the message "Hello, World!".
// The server is started using the start() method, and a message is printed to indicate that the server is running.
// This code is a demonstration of how to create a simple HTTP server in Java.
// It showcases the use of the com.sun.net.httpserver package to create a basic web server
// that can handle HTTP requests and send responses.
// The server can be extended to handle more complex requests and responses as needed.
// File: lesson-6/simpleHTTPserver.java
public class simpleHTTPserver {
    public static void main(String[] args) throws Exception {
        com.sun.net.httpserver.HttpServer server = com.sun.net.httpserver.HttpServer.create(
            new java.net.InetSocketAddress(8080), 0);
        server.createContext("/", exchange -> {
            String response = "Hello, World!";
            exchange.sendResponseHeaders(200, response.getBytes().length);
            try (java.io.OutputStream os = exchange.getResponseBody()) {
                os.write(response.getBytes());
            }
        });
        server.setExecutor(null); // creates a default executor
        server.start();
        System.out.println("Server started at http://localhost:8080/");
    }
}
