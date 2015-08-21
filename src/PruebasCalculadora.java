import static org.junit.Assert.*;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class PruebasCalculadora {
Calculadora  calculadora;
double valor=0;
int valor2=0;
	
	@Test
	public void ListaCircularTest() {
		 calculadora= new Calculadora(1,1);
			try {
				calculadora.readFile("datos.txt");
			}  
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			try {
				valor=calculadora.calcular();
			}
			catch (Exception NullPointerException){
				System.out.println("Se a producido un error, intente de nuevo");
				System.exit(0);
			}
			System.out.println("El resultado es: "+calculadora.calcular());        	
			valor2 = (int) valor;
			
			assertEquals(15, valor2);
		}
	
	@Test
	public void ListaSimplementeEnlazadatest() {
		 calculadora= new Calculadora(1,2);
			try {
				calculadora.readFile("datos.txt");
			}  
			catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				valor=calculadora.calcular();
			}
			catch (Exception NullPointerException){
				System.out.println("Se a producido un error, intente de nuevo");
				System.exit(0);
			}
			System.out.println("El resultado es: "+calculadora.calcular());
			valor2 = (int) valor;
			
			assertEquals(15, valor2);
	}
	
	
	@Test
	public void ListaDobleEnlazadaTest() {
		calculadora= new Calculadora(1,3);
		try {
			calculadora.readFile("datos.txt");
		}  
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			valor=calculadora.calcular();
		}
		catch (Exception NullPointerException){
			System.out.println("Se a producido un error, intente de nuevo");
			System.exit(0);
		}
		System.out.println("El resultado es: "+calculadora.calcular());        	
		valor2 = (int) valor;
		
		assertEquals(15, valor2);
	}

	@Test
	public void Vectortest() {
	calculadora= new Calculadora(2,0);
		try {
			calculadora.readFile("datos.txt");
		}  
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		try {
			valor=calculadora.calcular();
		}
		catch (Exception NullPointerException){
			System.out.println("Se a producido un error, intente de nuevo");
		}
		System.out.println("El resultado es: "+calculadora.calcular());        	
		valor2 = (int) valor;
		
		assertEquals(15, valor2);
	}


	@Test
	public void ArrayListTest() {
	calculadora= new Calculadora(3,0);
		try {
			calculadora.readFile("datos.txt");
		}  
		catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			valor=calculadora.calcular();
		}
		catch (Exception NullPointerException){
			System.out.println("Se a producido un error, intente de nuevo");
		}
		
		System.out.println("El resultado es: "+calculadora.calcular());        	
		valor2 = (int) valor;
			
		assertEquals(15, valor2);
	}

	
}

	
	
	