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
	/**
	 * @param file
	 * @throws FileNotFoundException
	 * @throws Exception
	 */
	public void readFile(String file) throws FileNotFoundException, Exception;
	/**
	 * @return
	 * @throws Exception
	 */
	public double calcular() throws Exception;
	
	
}