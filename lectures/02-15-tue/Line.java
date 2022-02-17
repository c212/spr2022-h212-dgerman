import java.awt.Graphics;

public class Line {
    Point a, b; 
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public void draw(Graphics g) {
        this.a.draw(g); 
        g.drawLine(this.a.x, this.a.y, this.b.x, this.b.y);
        this.b.draw(g);
    }
}