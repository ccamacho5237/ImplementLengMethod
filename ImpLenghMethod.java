import java.util.Scanner;
public class ImpLenghMethod
{
    private Scanner teclado;
    private String[] mensajes;
    
    public void cargar()
    {
        teclado=new Scanner(System.in);
        mensajes=new String[1];
        for(int f=0;f<1;f++) {
            System.out.print("Ingrese el mensaje: ");
            mensajes[f]=teclado.next();
        }   
    }
    
    public void imprimir() {
        for(int f=0;f<1;f++) {          
            String str= mensajes[f];
            int largo = str.length(); 
            System.out.print("tamaño del mensaje " +largo);
        }
    }

    public static void main(String[] ar) {
        ImpLenghMethod pv=new ImpLenghMethod();
        pv.cargar();
        pv.imprimir();
    }
}
