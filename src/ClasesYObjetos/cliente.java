package ClasesYObjetos;
import java.net.*;
import java.io.*;


public class cliente {
    Socket cliente;
    int puerto = 9000;
    String ip = "127.0.0.1";
    BufferedReader entrada;
    BufferedReader teclado;
    PrintStream salida;

    public void iniciarCliente() {
        try {

            cliente = new Socket(ip, puerto);
            entrada = new BufferedReader
                    (new InputStreamReader(cliente.getInputStream()));
            salida = new PrintStream(cliente.getOutputStream());
            String conection = entrada.readLine();
            System.out.println(conection);




        } catch (Exception e) {

        }
    }
        public void enviarMensaje(){
        try {
            BufferedReader teclado = new BufferedReader(new InputStreamReader(System.in));

            int valor = Integer.parseInt(teclado.readLine());
            salida.println(valor);
            System.out.println(valor);

            int peso = Integer.parseInt(teclado.readLine());
            salida.println(peso);
            System.out.println(peso);

            int porcentaje = Integer.parseInt(teclado.readLine());
            salida.println(porcentaje);
            System.out.println(porcentaje);

            entrada = new BufferedReader
                    (new InputStreamReader(cliente.getInputStream()));

            double montoTotal = Double.parseDouble(entrada.readLine());
            System.out.println(montoTotal);

            entrada.close();
            salida.close();
            teclado.close();
            cliente.close();

        }catch (Exception e){

        }

        }


}
