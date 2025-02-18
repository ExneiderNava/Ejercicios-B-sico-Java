
package ejercicios_github;

public class Ejercicios_GitHub {

   
    public static void main(String[] args) {
        //Crear factura
        crearFactura GenerarFactura = new crearFactura();
        
        GenerarFactura.tomarDatos();
        GenerarFactura.calculo();
        GenerarFactura.resultado();
       
        //condicional 1
       Condicional1 EjercicioAscensor = new Condicional1();
       
       EjercicioAscensor.tomarAsensor();
       EjercicioAscensor.verificarPiso();
       EjercicioAscensor.Agradecimeinto();
       
       //condicional 2
       
       Condicional2 pesoAscensor = new Condicional2();
       
       pesoAscensor.ingresarPeso();
       pesoAscensor.verificarPeso();
       pesoAscensor.finalizar();
       
       //condicional 3
       
       Condicional3 temperaturaAscensor = new Condicional3();
       
       temperaturaAscensor.IngresarTemperatura();
       temperaturaAscensor.verificarTemperatura();
       temperaturaAscensor.finalizar();
       
       //condicional 4
       
       Condicional4 SensorEmergencia = new Condicional4();
       
       SensorEmergencia.ingresarTemperatura();
       SensorEmergencia.verificarTemperatura();
       SensorEmergencia.Finalizar();
       
       //condicional 5
       
       Condicional5 Ascensor = new Condicional5();
       
       Ascensor.irPiso();
       Ascensor.Verificar();
       Ascensor.finalizar();
       
    }
    
}
