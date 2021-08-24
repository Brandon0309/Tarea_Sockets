package ClasesYObjetos;

import java.net.*;
import java.io.*;



public class server {




    public static void main(String []args) {

        //implementar cliente en main sin estorbar al server, quitar las solicitudes del server al cliente, crear GUI
        //ServerSocket server;
        //Socket socketSocket;
        //int puerto = 9000;
        //DataOutputStream socketSalida;
        //BufferedReader socketEntrada;
        ServerSocket server;
        Socket socketSocket;
        int puerto = 9000;
        //String ip = "127.0.0.1";
        PrintStream socketSalida;
        BufferedReader socketEntrada;

        try{
            //cliente clienteServer = new cliente();




            server = new ServerSocket(puerto);
            socketSocket = new Socket();
            socketSocket = server.accept();
            socketSalida = new PrintStream(socketSocket.getOutputStream());
            socketEntrada = new BufferedReader (new InputStreamReader(socketSocket.getInputStream()));
            socketSalida.println("Se logró conectar");
            System.out.println("Se logró conectar");



            //String msg = socketEntrada.readLine();

            //---------------VALORES-----------------------------------------------
            int valor = Integer.parseInt(socketEntrada.readLine());
            socketSalida.println(valor);
            System.out.println(valor);
            int peso = Integer.parseInt(socketEntrada.readLine());
            socketSalida.println(peso);
            System.out.println(peso);
            int porcentaje = Integer.parseInt(socketEntrada.readLine());
            socketSalida.println(porcentaje);
            System.out.println(porcentaje);



            //socketSalida.println("El valor del producto es de " + valor +
            //                   " el peso es de " + peso +
            //                   " y el impuesto aplicado es de " + porcentaje);
            //---------------VALORES-----------------------------------------------

            //socketSalida = new PrintStream(socketSocket.getOutputStream());
            double montoTotal = ((valor*porcentaje/100) + (peso*0.15));
            socketSalida.println("El monto total seria de: " + montoTotal);
            System.out.println(montoTotal);

            socketSocket.close();



        }catch (Exception e){};

    }

    /*private static boolean StringValueOf(int i) {
        String msg = String.valueOf(StringValueOf(0));
        boolean closeSocket = false;
        return closeSocket;
        //closeSocket = true;
       }
     */


}
