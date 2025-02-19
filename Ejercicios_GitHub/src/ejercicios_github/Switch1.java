
package ejercicios_github;
import java.util.Scanner;

public class Switch1 {
    Scanner sc = new Scanner(System.in);
    
    String tipoProducto;
    int cantidad;
    final int A = 6000;
    final int V = 50000;
    final int E = 120000;
    
    
    public void solicitud(){
        System.out.println("que tipo de producto desea comprar");
        System.out.println("A : (Alimentos)");
        System.out.println("V : (vestimenta)");
        System.out.println("E : (Electronicos)");
        tipoProducto = sc.nextLine().toUpperCase();
        System.out.println("cuantas unidades comprara de ese producto");
        while (true){
            cantidad = sc.nextInt();
            if(cantidad > 0){
                sc.nextLine();
                break;          
            } else {
                System.out.println("la cantidad debe ser un numero positivo");
                System.out.println("intentelo de nuevo");
                sc.next();
            }
        }
    }
    
    
    public void operacion(){
        switch(tipoProducto){
            case "A":
                System.out.println("tienes un 10% de descuento");
                Alimentos();
                break;
            case "V":
                System.out.println("tienes un 5% de descuento");
                Vestimenta();
                break;
            case "E":
                System.out.println("no hay descuento");
                Electronicos();
                break;
            default:
                System.out.println("opcion incorrecta");
                break;
                
        }
    }
    
    
    public void Alimentos(){
        if(tipoProducto.equals("A")){
            double total = (cantidad * A) * (1 - 0.10);
            double totalsd = cantidad*A;
            System.out.println("debes pagar " + total);
            System.out.println("sin descuento pagaria " + totalsd);
    }
   
    }
    
    public void Vestimenta(){
        if(tipoProducto.equals("V")){
            double total = (cantidad * V) * (1 - 0.05);
            double totalsd = cantidad*V;
            System.out.println("debes pagar " + total);
            System.out.println("sin descuento pagaria " + totalsd);
        }
    }
    
    public void Electronicos(){
        if(tipoProducto.equals("E")){
            double totalsd = cantidad*E;
            System.out.println("debes pagar " + totalsd);
        }
    }
    
    public void Finalizar(){
        System.out.println("fin del ejercicio 7");
        System.out.println("--------------------");
    }
}
