package academy.mindswap;

import java.io.IOException;

public class ServerInitializer {
    public static void main(String[] args) {
        try {
            Server server = new Server();
            server.start();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
