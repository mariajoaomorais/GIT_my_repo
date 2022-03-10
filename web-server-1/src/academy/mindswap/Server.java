package academy.mindswap;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.Buffer;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Server {
    ServerSocket serverSocket;
    ExecutorService service;


    public Server() throws IOException {
        this.serverSocket = new ServerSocket(8080);
        this.service = Executors.newCachedThreadPool();
    }

    public void start() throws IOException {
        while (true) {
            ClientHandler ch = new ClientHandler(serverSocket.accept());
            service.submit(ch);
        }
    }

    private class ClientHandler implements Runnable {
        Socket socket;
        BufferedReader in;
        DataOutputStream out;

        public ClientHandler(Socket socket) throws IOException {
            this.socket = socket;
            this.in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            this.out = new DataOutputStream(socket.getOutputStream());
        }

        @Override
        public void run() {
            try {
                while (true) {
                    String line = null;

                    line = in.readLine();

                    System.out.println(line);
                    String[] parts = line.split(" ");
                    String method = parts[0];
                    String path = parts[1];
                    String header;

                /*Socket socket = serverSocket.accept();
                BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                DataOutputStream out = new DataOutputStream(socket.getOutputStream());

                String line = in.readLine();
                System.out.println(line);

                File file = new File("www" + path);

                    //ServerSocket serverSocket = new ServerSocket(8080);

                    if (!file.exists() && file.isDirectory()) {

                        String response = """
                                <!DOCTYPE html>
                                <body>
                                <h1>Not Found</h1>
                                <img src="/orangotango.jpeg" alt="orangotango">
                                </body>
                                """;
                        header = "HTTP/1.1 23423434 Stupid call\r\n" +
                                "Content-Type: text/html\r\n" +
                                "Content-Length: " + response.length() + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";

                        out.writeBytes(header);
                        out.write(response.getBytes());
                        socket.close();
                        continue;
                    }
   */
                    if (path.equals("/")) {
                        String response = """
                                <!DOCTYPE html>
                                <body>
                                <h1>Welcome to our repository.</h1>
                                <img src="/zoo.png" alt="zoo">
                                </body>
                                """;

                        byte[] responseBytes = response.getBytes();

                        header = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: text/html\r\n" +
                                "Content-Length: " + responseBytes.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";

                        out.writeBytes(header);
                        out.write(responseBytes);
                        socket.close();
                        continue;
                    }

                    if (path.equals("/animals")) {

                        String response = """
                                <!DOCTYPE html>
                                <body>
                                <h1>These are our animals:</h1>
                                <h1>orangotango</h1>
                                <img src="/orangotango.jpeg" alt="orangotango">
                                <h1>tiger</h1>
                                <img src="/tiger.jpg" alt="tiger">
                                <h1>elephant</h1>
                                <img src="/elephant.jpeg" alt="elephant">
                                </body>
                                """;

                        byte[] responseBytes = response.getBytes();

                        header = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: text/html\r\n" +
                                "Content-Length: " + responseBytes.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";
                        out.writeBytes(header);
                        out.write(responseBytes);
                        socket.close();
                        continue;
                    }

                    if (path.equals("/zoo.png")) {

                        String response = """
                                <!DOCTYPE html>
                                <body>
                                <h1>zoo</h1>
                                <img src="zoo.png" alt="zoo">
                                </body>
                                """;

                        File image = new File("www/zoo.png");
                        byte[] imageData = Files.readAllBytes(Path.of(image.getPath()));

                        header = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: image/jpeg\r\n" +
                                "Content-Length: " + imageData.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";
                        out.writeBytes(header);
                        out.write(imageData);
                        socket.close();
                        continue;
                    }

                    if (path.equals("/elephant.jpeg")) {

                        File image = new File("www/elephant.jpeg");
                        byte[] imageData = Files.readAllBytes(Path.of(image.getPath()));

                        header = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: image/jpeg\r\n" +
                                "Content-Length: " + imageData.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";
                        out.writeBytes(header);
                        out.write(imageData);
                        socket.close();
                        continue;

                    }
                    if (path.equals("/tiger.jpg")) {

                        File image = new File("www/tiger.jpg");
                        byte[] imageData = Files.readAllBytes(Path.of(image.getPath()));

                        header = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: image/jpeg\r\n" +
                                "Content-Length: " + imageData.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";
                        out.writeBytes(header);
                        out.write(imageData);
                        socket.close();
                        continue;
                    }

                    if (path.equals("/orangotango.jpeg")) {

                        File image = new File("www/orangotango.jpeg");
                        byte[] imageData = Files.readAllBytes(Path.of(image.getPath()));

                        header = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: image/jpeg\r\n" +
                                "Content-Length: " + imageData.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";
                        out.writeBytes(header);
                        out.write(imageData);
                        socket.close();
                        continue;
                    }
                    if (path.equals("/favicon.ico")) {

                        File icon = new File("www/favicon.ico");
                        byte[] iconData = Files.readAllBytes(Path.of(icon.getPath()));

                        header = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: favicon/ico\r\n" +
                                "Content-Length: " + iconData.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";
                        out.writeBytes(header);
                        out.write(iconData);
                        socket.close();
                        continue;
                    }

                    if (path.equals("/zoo.pdf")) {

                        File pdf = new File("www/zoo.pdf");
                        byte[] pdfData = Files.readAllBytes(Path.of(pdf.getPath()));
                        Files.probeContentType(Path.of("www" + pdf));

                        header = "HTTP/1.1 200 OK\r\n" +
                                "Content-Type: zoo/pdf\r\n" +
                                "Content-Length: " + pdfData.length + "\r\n" +
                                "Connection: close\r\n" +
                                "\r\n";
                        out.writeBytes(header);
                        out.write(pdfData);
                        socket.close();
                        continue;
                    }

                }

            } catch (IOException e) {
                e.printStackTrace();
            }


            //File index = new File("www/index.html");
       /*

        String response = """
                    <!DOCTYPE html>
                    <body>
                    <h1>Not Found</h1>
                    <img src="/orangotango.jpeg" alt="orangotango">
                    </body>
                    """;
        header = "HTTP/1.1 23423434 Stupid call\r\n" +
                "Content-Type: text/html\r\n" +
                "Content-Length: " + response.length()+ "\r\n" +
                "Connection: close\r\n" +
                "\r\n";

        out.writeBytes(header);
        out.write(response.getBytes());
        socket.close();

        */

        }
    }
}