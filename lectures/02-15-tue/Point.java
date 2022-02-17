import java.awt.Graphics; 

public class Point {
    int x, y, radius = 10;
    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public void draw(Graphics g) {
        g.drawOval(this.x - this.radius, this.y - this.radius, 2 * this.radius, 2 * this.radius); 
    }
}