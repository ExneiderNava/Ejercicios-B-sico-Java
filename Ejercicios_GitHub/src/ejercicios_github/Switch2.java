
package ejercicios_github;
import java.util.Scanner;

public class Switch2 {
    Scanner sc = new Scanner(System.in);
    
    double peso,altura,imc;
    int imcint;
    
    
    public void pedirDatos(){
        System.out.println("cuanto pesa usted?");
        peso = sc.nextDouble();
        System.out.println("cuanto mide?");
        altura = sc.nextDouble();
        
         imc = peso / (altura * altura);
        imcint = (int) imc;
        
        System.out.println("tu imc es: " + imc);
    }
    
     
    
    public void operacion() {
        switch (imcint) {
            case 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18:
                System.out.println("Estás en bajo peso.");
                break;
            
            case 19, 20, 21, 22, 23, 24:
                System.out.println("Tienes un peso normal.");
                break;

            case 25, 26, 27, 28, 29:
                System.out.println("Tienes sobrepeso.");
                break;

            default:
                if (imc >= 30) {
                    System.out.println("Tienes obesidad.");
                } else {
                    System.out.println("Error en el cálculo.");
                }
                break;
        }
    }
    
    public void finalizar(){
        System.out.println("fin del ejercicio 8");
        System.out.println("-------------------");
    }

    
   
}
