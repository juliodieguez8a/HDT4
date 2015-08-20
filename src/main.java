
import java.io.FileNotFoundException;
/**
 *
 * @author Admin
 */
public class main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here		 
        Calculadora calculadoraPostfix = new Calculadora();
        System.out.println("Bienvenido a la calculadora");

        try{        
        	calculadoraPostfix.readFile("datos.txt");
        }
        catch (Exception e){
        	System.out.println("No se puede encontrar el documento datos.txt");
        }
        
        try{
            System.out.println("El resultado es: "+calculadoraPostfix.calcular());        	
        }
        catch (Exception e){
        	System.out.println("Los datos del documento no pueden ser procesados");
        	System.out.println("Revise el formato e intente nuevamente");
        }
   }
    
}