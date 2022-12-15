package Vista;
import javax.swing.JOptionPane;
public class InOut {
    public String pedirString(String m){
        return JOptionPane.showInputDialog(m);
    }
    
    public int pedirEnteros(String m){
        return Integer.parseInt(JOptionPane.showInputDialog(m));
    }
    
    public long pedirLong(String m){
        return Long.parseLong(JOptionPane.showInputDialog(m));
    }
    
    public void mostrarResultados(String m){
        JOptionPane.showMessageDialog(null, m);
    }
}
