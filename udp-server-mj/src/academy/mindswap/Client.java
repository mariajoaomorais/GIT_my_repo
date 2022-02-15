package academy.mindswap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class Client {
    public static void main(String[] args) throws IOException {

        int portNumber = 8080;
        String hostName = "localhost";
        DatagramSocket socket = new DatagramSocket();

        //CREATE A DATAGRAM PACKET
        byte[] message = "Hello World this is another message".getBytes();
        //reads a string from console:
        String input = "";
        while (!input.equals("exit")){
            BufferedReader br = new BufferedReader((new InputStreamReader(System.in)));
            System.out.println("Enter a message to send to the server: ");
            input = br.readLine();
            message = input.getBytes();
            Data

        }



        DatagramPacket sendPacket = new DatagramPacket(message, message.length, InetAddress.getByName(hostName), portNumber);

        socket.send(sendPacket);

    }



}
