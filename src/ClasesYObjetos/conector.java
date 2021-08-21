package ClasesYObjetos;
import jdk.internal.util.xml.impl.Input;

import java.net.*;
import java.io.*;


public class conector {

    ServerSocket server;
    Socket socketSocket;
    int puerto = 9000;
    DataOutputStream socketSalida;
    BufferedReader socketEntrada;
    /*Socket cliente;
    int puerto = 9000;
    String ip = "127.0.0.1";
    BufferedReader entrada, teclado;
    PrintStream salida; */


    public void iniciar() {

        try{
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

            server = new ServerSocket(puerto);
            socketSocket = new Socket();
            socketSocket = server.accept();

            socketEntrada = new BufferedReader (new InputStreamReader(socketSocket.getInputStream()));
            int valor = Integer.parseInt(socketEntrada.readLine());
            int peso = Integer.parseInt(socketEntrada.readLine());
            int porcentaje = Integer.parseInt(socketEntrada.readLine());

            System.out.println("El valor del producto es de " + valor +
                               " el peso es de " + peso +
                               " y el impuesto aplicado es de " + porcentaje);

            socketSalida = new DataOutputStream(socketSocket.getOutputStream());
            double montoTotal = (valor*porcentaje/100) + (peso*0.15);
            socketSalida.writeUTF("El monto total seria de: " + montoTotal);
            socketSocket.close();

        }catch (Exception e){};

    }

}
