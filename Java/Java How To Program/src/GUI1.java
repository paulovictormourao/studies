import javax.swing.JOptionPane;

public class GUI1 {
    public static void main(String[] args){
        String name = JOptionPane.showInputDialog("");
        String message = String.format("Welcome, %s, to Java Programming", name);

        JOptionPane.showMessageDialog(null, message);
    }
}
