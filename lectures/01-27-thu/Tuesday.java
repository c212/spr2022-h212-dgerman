
import javax.swing.*; 
import java.awt.*; 
import java.awt.event.*;

public class Tuesday extends JComponent implements MouseMotionListener, MouseListener {
                          // notice the three different roles an object of this class plays
  What what; // this is the thing we need to show  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Drawing a What"); // set up a frame with a title 
    What what = new What(1, new What(2, new What(3, new What(4, null)))); // create a linked list to play with  
    Tuesday board = new Tuesday(what); // set up the device that will render all this 
    frame.add(board); // put that in the frame  
    frame.setSize(800, 800); // make the frame of a certain size, also visible  
    frame.setVisible(true); 
  }
  What selected; // indicates what node is selected if any  
  public void mouseMoved(MouseEvent e) { } // mandatory seven methods defined for mouse event handling  
  public void mouseDragged(MouseEvent e) { // we will update the position of selected (if any) when dragging it 
    if (this.selected == null) {
      
    } else {
      this.selected.moveTo(e.getX(), e.getY()); 
      this.repaint(); // then once the position is updated we want to see the change (mvc, animation)  
    }
  }
  public void mouseReleased(MouseEvent e) { // losing interest in a node to drag around  
    this.selected = null; 
  }
  public void mousePressed(MouseEvent e) { // this is how we select a node  
    What what = this.what; 
    while (what != null) {
      if (what.contains(e.getX(), e.getY())) {
        this.selected = what;  
        break;
      } else {
        what = what.next; 
      }
    }
  }
  public void mouseEntered(MouseEvent e) { } // we don't need these methods, but we have to define them  
  public void mouseExited(MouseEvent e) { }
  public void mouseClicked(MouseEvent e) { }
  Tuesday(What what) { // constructor established the event loop 
    this.what = what;  
    this.addMouseMotionListener(this); 
    this.addMouseListener(this); 
  }
  public void paintComponent(Graphics g) { // when we need to update what the user is seeing  
    what.draw(g); // as always, we delegate the drawing 
  }
}