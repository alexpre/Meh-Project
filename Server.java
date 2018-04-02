import java.net.*;
import java.io.*;


public class Server extends Thread {

    private ServerSocket serverSocket;
    private static String telefon;

    public Server(int port) throws IOException {

        serverSocket = new ServerSocket(port);

    }

        public void run() {

            while (true) {

                try {

                    Socket server = serverSocket.accept();

                        DataInputStream input = new DataInputStream(server.getInputStream());
                        telefon = input.readUTF();

                        if (telefon != null) {
                            CallerID.Caller();
                        }

                    //server.close();

                }catch (IOException e){
                    e.printStackTrace();
                    break;
                }

            }

        }

    public static String getTelefon () {

        return telefon;

    }
}
