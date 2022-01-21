import javax.swing.JFrame;
import javax.swing.JComponent;

public class Friday extends JComponent {
    public static void main(String[] args) {
        JFrame a = new JFrame("Move circles with the mouse.");
        // System.out.println( a );
        a.setSize(400, 400);
        a.setVisible(true);
        
        Horse b = new Horse(); 
        Unicorn c = new Unicorn(); 
        Horse d = new Unicorn(); 
        // Unicorn e = new Horse(); 
        b.talk(); // Howdy
        c.talk(); // Bonjour
        d.talk(); // Bonjour
    }
}