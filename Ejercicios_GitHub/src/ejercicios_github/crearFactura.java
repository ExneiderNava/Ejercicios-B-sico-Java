
package ejercicios_github;
import java.util.Scanner;

public class crearFactura {
    Scanner sc = new Scanner(System.in);
    
    String nombre,producto;
    int cantidad_productos, precioProducto, precioTotal;
    boolean esEstudiante;
    
    public void tomarDatos(){
        
         System.out.println("ingrese su nombre");
        nombre = sc.nextLine();
        
        System.out.println("ingrese el nombre del producto");
        producto = sc.nextLine();
        
    
        
        System.out.println("ingrese la cantidad de productos");
        cantidad_productos = sc.nextInt();
        
        System.out.println("ingrese el precio del producto");
        precioProducto = sc.nextInt();
        
    }
        
    public void calculo(){
        precioTotal = cantidad_productos * precioProducto;
        
        System.out.println("el total es: " + precioTotal);
        
        
    }
    
    public void resultado(){
        
        System.out.println("es usted estudiante?");
        esEstudiante = sc.nextBoolean();
        
        if (esEstudiante){
            double impuesto;
            impuesto = precioTotal * (0.5/100);
            System.out.println("el impuesto es: " + impuesto);
            
        } else {
            double impuesto;
            impuesto = precioTotal * (0.13/100);
            System.out.println("el impuesto es: " + impuesto);
        }
        
        
        
        System.out.println("el total es: " + esEstudiante);
       
        
    }
}

