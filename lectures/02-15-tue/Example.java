import javax.swing.JFrame;

public class Example { 
    public static void main(String[] args) {
        
        JFrame a = new JFrame("The Challenge");
        Screen screen = new Screen(); 
        a.add(screen); 
        a.setVisible(true); 
        a.setSize(500, 500); 
        
    }
}