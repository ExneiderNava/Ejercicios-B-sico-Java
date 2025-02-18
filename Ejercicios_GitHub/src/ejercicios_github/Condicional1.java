
package ejercicios_github;
import java.util.Scanner;

public class Condicional1 {
    Scanner sc = new Scanner (System.in);
    
    int piso;
    int limitePiso = 6;
    
    
    public void tomarAsensor(){
        
        System.out.println("Ingrese el piso al que desea ir");
        piso = sc.nextInt();
    }
    
    public void verificarPiso(){
        
        if(piso <= limitePiso){
            System.out.println("vamos para el piso "+piso);
        } else {
            System.out.println("numero de piso incorrecto");
        }
    }
    
    public void Agradecimeinto(){
        System.out.println("Gracias por usar nuestros servicios");
        System.out.println("      fin de ejercicio 2    ");
        System.out.println("----------------------------");
    }
    
   
}
