
package textos;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;




/**
 *
 * @author kinky
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        try {
            
            FileReader fr = new FileReader("mi_fichero.txt");
            
            BufferedReader br = new BufferedReader(fr);
            
            String cadena;
            
            try {
                while ((cadena = br.readLine()) != null) {
                    
                    System.out.println(cadena);
                     
                }
            } catch (IOException ex) {
                System.out.println("Error1" + ex.getMessage());
            }
        
        
        } catch (FileNotFoundException ex) {
            System.out.println("Error " + ex.getMessage());
        }
     
     
   
    }
    
}
