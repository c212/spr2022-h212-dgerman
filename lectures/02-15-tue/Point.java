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
    public double distanceTo(Point other) {
        int dx = this.x - other.x, dy = this.y - other.y;
        return Math.sqrt( Math.pow(dx, 2) + Math.pow(dy, 2) ); 
    }
}