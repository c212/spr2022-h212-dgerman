import java.awt.Graphics; 
import java.awt.Color; 

public class Circle {
    int value;
    int x, y; 
    int radius = 16; 
    public Circle(int v, int x, int y) {
        this.value = v;
        this.x = x;
        this.y = y; 
    }
    public void draw(Graphics g) {
        int xc = this.x + this.radius, yc = this.y + this.radius; 
        g.setColor(Color.WHITE);
        g.fillOval(this.x, this.y, 2 * this.radius, 2 * this.radius); 
        g.setColor(Color.BLACK);
        g.drawString(this.value + "", xc-2, yc+2); 
        g.drawOval(this.x, this.y, 2 * this.radius, 2 * this.radius); 
    }
}