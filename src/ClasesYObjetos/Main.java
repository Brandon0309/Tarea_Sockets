package ClasesYObjetos;
import java.net.*;
import java.io.*;

public class Main {
    /*
    static Socket cliente;
    static int puerto = 9000;
    static String ip = "127.0.0.1";
    static BufferedReader entrada;
    static BufferedReader teclado;
    static PrintStream salida;

     */

    public static void main(String[] args) {
        try {


            server s = new server();
            s.iniciar();

            cliente c = new cliente();
            c.iniciarCliente();






        }catch (Exception e){};



    }

}
