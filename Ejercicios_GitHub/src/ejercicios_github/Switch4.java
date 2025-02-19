
package ejercicios_github;
import java.util.Scanner;

public class Switch4 {
    Scanner sc = new Scanner(System.in);
    
    String estadoPartido;
    int ganado = 8;
    int empatado = 5;
    int perdido = 0;
    int puntaje = 0;
    
    public void ingresar(){
        System.out.println("ingrese el resultado del partido");
        System.out.println("ganado, perdido o empatado");
        estadoPartido = sc.nextLine().toUpperCase();
    }
    
    public void resultados(){
        switch (estadoPartido) {
            case "GANADO":
                System.out.println("se ha ganado " + ganado + " puntos");
                System.out.println("vas en primer lugar");
                
                break;
            case "PERDIDO":
                System.out.println("se ha ganado " + perdido + " puntos");
                System.out.println("vas en segundo lugar");
            case "EMPATADO":
                System.out.println("se ha gando " + empatado + " puntos");
                System.out.println("vas de ultimo lugar");
            default:
                System.out.println("Opcion no valida");
        }
    }
    
     public void finalizar(){
        System.out.println("fin del ejercicio 10");
        System.out.println("-------------------");
    }
    
}
