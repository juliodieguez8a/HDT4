
import java.io.FileNotFoundException;

import java.util.Scanner;
/**
 * @author Julio
 *
 */
public class main {
    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException {
        // TODO code application logic here		 
    Scanner sc;
    int menu = 0;
    int opcion= 0;
    int opcion1 =0;

         
        menu=0;
        System.out.println("Bienvenido a la calculadora de postfix. \nEscoja el tipo de almacenamiento a utilzar: ");
        while (menu==0){
                sc = new Scanner (System.in); //se crea una variable en donde se guardan los datos que se piden                
                System.out.println("    1. Listas");
                System.out.println("    2. Vector");
                System.out.println("    3. ArrayList");
                System.out.print("      Ingrese la pocion: ");            
                try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
                catch(Exception e){System.out.println();}
                if (opcion==1){
                    menu =1;
                    opcion1=1;
                }
                if (opcion==2){
                    menu=2;
                    opcion1 =2;
                }
                if (opcion==3){
                    opcion1 =3;
                    menu=2;
                }
            }
        opcion=0;
        while (menu==1){
            System.out.println("Escoja el tipo de Lista que quiere utilzar:");   
            sc = new Scanner (System.in); //se crea una variable en donde se guardan los datos que se piden                
               System.out.println("    1. Circular");
               System.out.println("    2. Simplemente Enlazada");
               System.out.println("    3. Doblemente Enlazada");
               System.out.print("      Ingrese la pocion: ");            
               try{opcion=sc.nextInt();} //se guardan los datos en otra variable    
               catch(Exception e){System.out.println();}
               if (opcion==1||opcion==2||opcion==3)menu=2;
           }

        
        
        Calculadora calculadoraPostfix = new Calculadora(opcion1,opcion);
        System.out.println("\nPostFix:");

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