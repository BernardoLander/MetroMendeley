
package metromendeley;
import ventana.Inicio;


public class MetroMendeley {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Functions functions = new Functions();
        String w = functions.readText();
        Inicio fw = new Inicio();
        fw.setVisible(true);
    }
    
}
