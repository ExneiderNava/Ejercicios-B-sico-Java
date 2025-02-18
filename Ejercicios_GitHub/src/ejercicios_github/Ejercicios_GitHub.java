
package ejercicios_github;
import java.util.Scanner;

public class Ejercicios_GitHub {

   
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion;
        
     do{
       
        System.out.println("Instructor elija cual ejercicio desea ver");
        System.out.println("1. Ejercicio de crear factura");
        System.out.println("2. Ejercicio condicional 1");
        System.out.println("3. Ejercicio condicional 2");
        System.out.println("4. Ejercicio condicional 3");
        System.out.println("5. Ejercicio condicional 4");
        System.out.println("6. Ejercicio condicional 5");
         System.out.println("7. Salir");
        
        opcion = sc.nextInt();
         crearFactura GenerarFactura = new crearFactura();
         Condicional1 EjercicioAscensor = new Condicional1();
         Condicional2 pesoAscensor = new Condicional2();
         Condicional3 temperaturaAscensor = new Condicional3();
         Condicional4 SensorEmergencia = new Condicional4();
         Condicional5 Ascensor = new Condicional5();
         
        switch (opcion){
            case 1:
                GenerarFactura.tomarDatos();
                GenerarFactura.calculo();
                GenerarFactura.resultado();
                break;
            case 2:   
                EjercicioAscensor.tomarAsensor();
                EjercicioAscensor.verificarPiso();
                EjercicioAscensor.Agradecimeinto();
                break;
            case 3:
                pesoAscensor.ingresarPeso();
                pesoAscensor.verificarPeso();
                pesoAscensor.finalizar();
                break;
            case 4:
                temperaturaAscensor.IngresarTemperatura();
                temperaturaAscensor.verificarTemperatura();
                temperaturaAscensor.finalizar();
                break;
            case 5:
                SensorEmergencia.ingresarTemperatura();
                SensorEmergencia.verificarTemperatura();
                SensorEmergencia.Finalizar();
                break;
            case 6:
                Ascensor.irPiso();
                Ascensor.Verificar();
                Ascensor.finalizar();
                break;
            case 7:
                System.out.println("deteniendo programa");
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
     } while (opcion != 7);
     
     sc.close();
   
       
    }
    
}
