import java.util.ArrayList; 
import javax.swing.JFrame; 
import javax.swing.JComponent; 
import java.awt.Graphics; 

public class Sequence extends JComponent {
  private ArrayList<Integer> values; 
  ArrayList<Circle> circles = new ArrayList<Circle>(); 
  public Sequence() {
    this.values = new ArrayList<Integer>();
  }
  public Sequence(int[] values){ 
    this(); // ha, ha!
    for (int v : values) {
      this.values.add( v);
      this.circles.add(new Circle(v, (int)(Math.random() * 400 + 50), 
                                     (int)(Math.random() * 400 + 50))); 
      
    }
  } 
  public void add(int n) {
    this.values.add(n);
  }
  public Integer get(int n) {
    return this.values.get(n);  
  }
  public int length() { return this.values.size(); }
  public String toString() {
    return this.values.toString();
  }
  public void paintComponent(Graphics g) {
      // g.drawString(this + "", 80, 120); 
      for (int index = 0; index < this.values.size(); index += 1) {
          this.circles.get(index).draw(g); 
      }
  }
  public static void main(String[] args) {    
    Sequence m = new Sequence( new int[] { 6, 2, 1, 4, 3, 5 } ); 
    System.out.println( m );
    JFrame f = new JFrame("Homework 03"); 
    f.add(m);
    f.setVisible(true);
    f.setSize(500, 500);
  }
}