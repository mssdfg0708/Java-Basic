package Second;

import java.io.*;
import java.net.*;

public class TcpIpClient01 {
    public static void main(String[] args) {
        try {
            String serverIP = "127.0.0.1";
            Socket socket = new Socket(serverIP, 7777);
            System.out.println("Connected to Server");
            Sender sender = new Sender(socket);
            Receiver receiver = new Receiver(socket);

            sender.start();
            receiver.start();

        } catch (ConnectException connectException) {
            connectException.printStackTrace();
        } catch (IOException ioException) {
            ioException.printStackTrace();
        } catch (Exception exception) {
            exception.printStackTrace();
        }
    }
}
