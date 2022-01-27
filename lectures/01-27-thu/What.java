import java.awt.*; 

public class What {
  int x, y; // since each node needs to be drawn somewhere 
  public void moveTo(int x, int y) { //since we intend to move it
    this.x = x;
    this.y = y; 
  }
  int value; //every node is meant to carry a value
  What next; //this is the linked nature of What
  What(int value, What next) { // the constructor
    this.value = value; 
    this.next = next; 
    this.x = (int)(Math.random() * 400 + 50); // coordinates are initially random 
    this.y = (int)(Math.random() * 400 + 50); 
    
  }
  public boolean contains(int x, int y) { // we need to know when we have clicked inside with the mouse 
    return Math.sqrt(Math.pow(this.x - x, 2) + Math.pow(this.y - y, 2)) <= 20;  
  }
  public void draw(Graphics g) { // this is the recursive draw function  
    Graphics2D g2 = (Graphics2D)g;
    float thickness = 6;
    Stroke oldStroke = g2.getStroke();
    g2.setStroke(new BasicStroke(thickness)); // lines between nodes have a certain thickness  
    Font myFont = new Font("Courier", Font.BOLD, 40); // numbers inside nodes have a certain size  
    g2.setFont(myFont); 
    if (this.next == null) {
      // see below 
    } else {
      g2.drawLine(this.x, this.y, this.next.x, this.next.y); 
      this.next.draw(g); 
    }
    // here     
    g2.setColor(Color.YELLOW); // draw the inside  
    g2.fillOval(this.x - 30, this.y - 30, 60, 60); 
    g2.setColor(Color.BLACK); // draw the outside  
    g2.drawOval(this.x - 30, this.y - 30, 60, 60); 
    g2.drawString(this.value + "", this.x-10, this.y+10); // and the value carried 

  }
}