
package entidad;
import java.awt.event.KeyEvent;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

public class Validaciones {
   
    public void validarLetras(KeyEvent evt){
        char validar = evt.getKeyChar();
        
        if(Character.isDigit(validar)){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "INGRESE SOLO LETRAS", "ERROR", JOptionPane.ERROR_MESSAGE);
            
        }
    }
    
    public void validarNumeros(KeyEvent evt){
        char validar = evt.getKeyChar();
        
        if(Character.isLetter(validar)){
            Toolkit.getDefaultToolkit().beep();
            evt.consume();
            
            JOptionPane.showMessageDialog(null, "INGRESE SOLO NUMEROS", "ERROR", JOptionPane.ERROR_MESSAGE);
        }
    }
}
