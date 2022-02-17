import javax.swing.JComponent; 
import java.awt.Graphics;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseEvent;

public class Screen extends JComponent implements MouseMotionListener, MouseListener {
    public Screen() {
        this.addMouseListener(this); 
        this.addMouseMotionListener(this); 
    }
    public void mouseMoved(MouseEvent e) { }
    public void mouseDragged(MouseEvent e) { 
        int x = e.getX(), y = e.getY(); 
        System.out.println("(" + x + ", " + y + ")"); 
        this.line.b = new Point(x, y);
        this.repaint();
    }
    public void mouseEntered(MouseEvent e) { 
        System.out.println("In");
    } 
    public void mouseExited(MouseEvent e) { 
        System.out.println("Out");
    }
    public void mousePressed(MouseEvent e) { 
        int x = e.getX(), y = e.getY();
        Point a = new Point(x, y); 
        this.line = new Line(a, a);
        this.repaint(); 
    }
    public void mouseReleased(MouseEvent e) { 
        // this.line = null;
        this.repaint();
    }
    public void mouseClicked(MouseEvent e) { }
    Line line;
    public void paintComponent(Graphics g) {
        if (this.line == null) {
            g.drawString("No line.", 50, 100); 
        } else {
            this.line.draw(g); 
        }
    }
}