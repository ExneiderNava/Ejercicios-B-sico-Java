
package ejercicios_github;
import java.util.Scanner;

public class Condicional5 {
    Scanner sc = new Scanner(System.in);
    
    int piso;
    double minTemperatura = 18.0;
    double maxTemperatura = 25.0;
    double temperaturaActual;
    
    public void irPiso(){
        System.out.println("ingrese el piso al que desea ir");
        piso = sc.nextInt();
    }
    
    public void Verificar(){
        
        System.out.println("a que temperatura estamos?");
        temperaturaActual = sc.nextDouble();
        
         if(temperaturaActual >= minTemperatura && temperaturaActual <= maxTemperatura){
            System.out.println("Vamos hacia el piso " + piso);
        } else {
            System.out.println("la temperatura no es adecuada");
             System.out.println("por favor utilice las escaleras");
        }
    }
    
    public void finalizar(){
        System.out.println("Gracias por usar nuestro servicio");
        System.out.println("      fin de ejercicio 6    ");
        System.out.println("----------------------------");
    }
    
}
