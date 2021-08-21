package ClasesYObjetos;
import java.net.*;
import java.io.*;


public class conector {

    ServerSocket server;
    Socket socket;
    int puerto = 9000;
    DataOutputStream salida;
    BufferedReader entrada;

    public void iniciar() {
        try{
            server = new ServerSocket(puerto);
            socket = new Socket();
            socket = server.accept();

            entrada = new BufferedReader(new InputStreamReader(socket.getInputStream()))

        }catch (Exception e){};

    }

}
