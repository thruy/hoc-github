import javax.swing.JOptionPane;
public class vd3{
    public static void main (String[] args) {
        String result;
        result = JOptionPane.showInputDialog("Nhap cai chi do di");
        JOptionPane.showMessageDialog(null, "OK, "+ result +"!");
        System.exit(0);
    }
}