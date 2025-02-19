
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
        System.out.println("7. Ejercicio Switch 1");
        System.out.println("8. Ejercicio Switch 2");
        System.out.println("9. Ejercicio Switch 3");
        System.out.println("10. Ejercicio Switch 4");
        System.out.println("11. Ejercicio Switch 5");
        System.out.println("12. Salir");
        
        opcion = sc.nextInt();
         crearFactura GenerarFactura = new crearFactura();
         Condicional1 EjercicioAscensor = new Condicional1();
         Condicional2 pesoAscensor = new Condicional2();
         Condicional3 temperaturaAscensor = new Condicional3();
         Condicional4 SensorEmergencia = new Condicional4();
         Condicional5 Ascensor = new Condicional5();
         Switch1 Alimentos = new Switch1();
         Switch2 IMC = new Switch2();
         Switch3 peliculas = new Switch3();
         Switch4 partido = new Switch4();
         Switch5 menu = new Switch5();
         
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
                Alimentos.solicitud();
                Alimentos.operacion();
                Alimentos.Finalizar();
            case 8:
                IMC.pedirDatos();
                IMC.operacion();
                IMC.finalizar();
            case 9:
                peliculas.SolicitarInfo();
                peliculas.recomendacion();
                peliculas.finalizar();
            case 10:
                partido.ingresar();
                partido.resultados();
                partido.finalizar();
            case 11:
                menu.menú();
                menu.metodoPago();
                menu.pedidoPlato();
                menu.pedidoBebida();
                menu.operacion();
                menu.finalizar();
            case 12:
                System.out.println("deteniendo programa");
                break;
            default:
                System.out.println("opcion invalida");
                break;
        }
     } while (opcion != 12);
     
     sc.close();
   
       
    }
    
}
