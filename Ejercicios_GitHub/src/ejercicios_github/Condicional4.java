
package ejercicios_github;
import java.util.Scanner;

public class Condicional4 {
    Scanner sc = new Scanner(System.in);
    
    double temperaturaAmbiente;
    double umbralAlerta = 35.0;
    
    public void ingresarTemperatura(){
        System.out.println("cual es la temperatura actual?");
        temperaturaAmbiente = sc.nextDouble();
    }
    
    public boolean verificarTemperatura(){
        
        if(temperaturaAmbiente >= umbralAlerta){
            System.out.println("ALERTA!!!!! PELIGRO !!!!!");
            return true;
        } else {
            System.out.println("la temperatura es normal");
            return false;
        }
    }
    
    public void Finalizar(){
        
        boolean emergencia = verificarTemperatura();
        
        if(emergencia){
            System.out.println("Esto es una emergencia por favor busca refugio");
        } else {
            System.out.println("Gracias por usar nuestros servicios");
        }
        System.out.println("      fin de ejercicio 5    ");
        System.out.println("----------------------------");
        
    }
    
}
