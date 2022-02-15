package academy.mindswap;

import java.io.IOException;
import java.net.*;

public class Server {

    public static void main(String[] args) throws IOException {
	// write your code here

        // OPEN AN UDP SOCKET
        int portNumber = 8080;
        String hostName = "localhost";
        DatagramSocket socket = new DatagramSocket(portNumber);

// CREATE A DATAGRAM PACKET AND SEND IT FROM THE SOCKET

       // byte[] message = "Hello World".getBytes();
       // DatagramPacket sendPacket = new DatagramPacket(message, message.length, InetAddress.getByName(hostName), portNumber);
       // socket.send(sendPacket);

// CREATE A DATAGRAM PACKET AND RECEIVE DATA FROM THE THE SOCKET
        byte[] recvBuffer = new byte[1024];

        while(socket.isBound()) {

            DatagramPacket receivedPacket = new DatagramPacket(recvBuffer, recvBuffer.length);
            InetAddress address = receivedPacket.getAddress();
            int port = receivedPacket.getPort();

            System.out.println("Waiting for packet...");
            socket.receive(receivedPacket); // blocking method!


            String receivedString = new String(receivedPacket.getData(), 0, receivedPacket.getLength());
            System.out.println("Received: " + receivedString);
        }

// CLOSE THE SOCKET
        socket.close();

    }


}
