import javax.swing.JFrame;
import javax.swing.JComponent;
import java.awt.Graphics;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

public class Friday extends JComponent implements MouseMotionListener {
    public void mouseMoved(MouseEvent e) { }
    public void mouseDragged(MouseEvent e) { 
        System.out.println("(" + e.getX() + ", " + e.getY() + ")");
    }
    public static void main(String[] args) {
        JFrame a = new JFrame("Move circles with the mouse.");
        // System.out.println( a );
        a.setSize(400, 400);
        a.setVisible(true);

        Friday e = new Friday();
        a.add(e); 
        
        a.addMouseMotionListener( e ); 

    }
    Friday() {
        this.a = new Penguin(10, 20, 30);
        this.b = new Penguin(200, 120, 35); 
        this.c = new Penguin(80, 220, 50);
    }
    Penguin a, b, c; 
    public void paintComponent(Graphics g) {
        this.a.ward(g); 
        this.b.ward(g);
        this.c.ward(g); 
    }
}