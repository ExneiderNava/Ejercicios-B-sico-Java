
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
    }
    
}
