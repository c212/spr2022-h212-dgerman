import java.awt.Graphics; 

public class Circle {
    int value;
    int x, y; 
    int radius = 8; 
    public Circle(int v, int x, int y) {
        this.value = v;
        this.x = x;
        this.y = y; 
    }
    public void draw(Graphics g) {
        int xc = this.x + this.radius, yc = this.y + this.radius; 
        g.drawString(this.value + "", xc, yc); 
        g.drawOval(this.x, this.y, 2 * this.radius, 2 * this.radius); 
    }
}