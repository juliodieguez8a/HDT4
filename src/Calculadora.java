import java.io.FileNotFoundException;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Calculadora<P> implements ADTCalculadora{
    
    private String datosPosfix; 
    private double Resultado;
    private StackAbstracta<Double> numeros;
    Factory factoryP = new Factory(); 
    
    public Calculadora(int op1, int op2){
        numeros = factoryP.getStack(op1,op2);
    }
    
    public void readFile(String file) throws FileNotFoundException {
        FileReader fr = new FileReader(file);
        BufferedReader bf = new BufferedReader(fr);

        try {
                datosPosfix = bf.readLine();
        } catch (IOException e) {
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

 