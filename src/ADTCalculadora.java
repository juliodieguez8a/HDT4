import java.io.FileNotFoundException;

/**
 * 
 */

/**
 * @author Boggdan Barrientos, 
 *
 */
import java.io.FileNotFoundException;

public interface ADTCalculadora<P> {
	public void readFile(String file) throws FileNotFoundException, Exception;
	public double calcular() throws Exception;
	
	
}