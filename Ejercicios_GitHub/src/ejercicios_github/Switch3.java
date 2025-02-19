
package ejercicios_github;
import java.util.Scanner;

public class Switch3 {
    Scanner sc = new Scanner(System.in);
    
    int edad;
    
    public void SolicitarInfo(){
        System.out.println("por favor ingrese su edad");
        edad = sc.nextInt();
    }
    
    public void recomendacion(){
        switch(edad){
            case 1,2,3,4,5,6:
                System.out.println("te recomendamos peliculas animadas y educativas");
                System.out.println("aptas para todas las edades");
                break;
            case 7,8,9,10,11,12,13,14,15,16,17:
                System.out.println("te sugerimos que veas peliculas adecuadas para la familia");
                System.out.println("animacion, aventuras y comdedias familiares");
                break;
            case 18,19,20,21,22,23,24,25,26,27,28,29,30:
                System.out.println("te sugerimos ver peliculas de");
                System.out.println("accion, drama, comedia y ciencia ficcion");
                break;
            default:
                if(edad > 30){
                    System.out.println("te recomendamos que veas peliculas clasicas y dramas");
                } else {
                    System.out.println("numero no valido");
                }
                break;
        }
    }
    
    public void finalizar(){
        System.out.println("fin del ejercicio 9");
        System.out.println("-------------------");
    }
}
