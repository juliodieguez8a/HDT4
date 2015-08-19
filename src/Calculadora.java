import java.io.FileNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
/**
 *
 * @author Admin
 */
public class Calculadora<P> implements ADTCalculadora{
    
    private String datosPosfix; 
    private double Resultado;
    private Stack<Double> numeros= new Stack<Double>();
   
    
    /* (non-Javadoc)
     * @see ADTCalculadora#readFile(java.lang.String)
     */
    public void readFile(String file) throws FileNotFoundException {
        // TODO Auto-generated method stub
        // tiene que tener el valor: file = "datos.txt"
        FileReader fr = new FileReader(file);
        BufferedReader bf = new BufferedReader(fr);

        try {
                datosPosfix = bf.readLine();
        } catch (IOException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
        }
        
        System.out.println(datosPosfix);		
	
    }
    
    /* (non-Javadoc)
     * @see ADTCalculadora#calcular()
     */
    public double calcular(){
	char[] cadenaChar = datosPosfix.toCharArray();

	for (int i = 0; i < datosPosfix.length(); i++){
		if (cadenaChar[i]== '+'){
                    numeros.push(numeros.pop()+numeros.pop());
		}
                else if (cadenaChar[i]== '-'){
                    numeros.push(numeros.pop()-numeros.pop());
		}
                else if (cadenaChar[i]== '*'){
                    numeros.push(numeros.pop()*numeros.pop());
		}            
                else if (cadenaChar[i]== '/'){
                    double x =numeros.pop();
                    double y =numeros.pop();
                    numeros.push(y/x);
		}
                else if (cadenaChar[i]== ' '){
                    ;
		}else {
                    numeros.push(Double.parseDouble(""+cadenaChar[i]));
                            }
	}    

        Resultado = numeros.pop();

        return Resultado;
        
    }
}

 