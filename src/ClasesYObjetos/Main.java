package ClasesYObjetos;
import java.net.*;
import java.io.*;

public class Main {
    static Socket cliente;
    static int puerto = 9000;
    static String ip = "127.0.0.1";
    static BufferedReader entrada;
    static BufferedReader teclado;
    static PrintStream salida;

    public static void main(String[] args) {
        try {


            server s = new server();
            s.iniciar();


            /*
            cliente = new Socket(ip, puerto);
            entrada = new BufferedReader
                    (new InputStreamReader(cliente.getInputStream()));
            teclado = new BufferedReader(new InputStreamReader(System.in));
            String tec = teclado.readLine();
            salida = new PrintStream(cliente.getOutputStream());
            salida.println(tec);
            String msg = entrada.readLine();
            System.out.println(msg);

            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();
            */

        }catch (Exception e){};



    }

}
