import java.io.*;
import java.net.Socket;

public class ServerMain {
    public static void main(String[] args){

        int port = 666;
        try {
            System.out.println("Connecting to Server on port " + port);
            Socket client = new Socket("192.168.0.106", port);

            System.out.println("Just connected to " + client.getRemoteSocketAddress());

            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out = new DataOutputStream(outToServer);

            out.writeUTF("07242105");
            System.out.println("Mesaj trimis.");


        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
