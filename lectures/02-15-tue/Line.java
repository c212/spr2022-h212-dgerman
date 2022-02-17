import java.awt.Graphics;

public class Line { 
    Point a, b; 
    public Line(Point a, Point b) {
        this.a = a;
        this.b = b;
    }
    public void draw(Graphics g) {
        this.a.draw(g); 
        // g.drawLine(this.a.x, this.a.y, this.b.x, this.b.y);
        int x1 = a.x, y1 = a.y, x2 = b.x, y2 = b.y;
        // this.drawLine(x1, y1, x2, y2, g);
        for (double t = 0; t < 1; t += 0.1) { // shane's method
            int x = (int) (Math.round(x1 + t * (x2 - x1)));
            int y = (int) (Math.round(y1 + t * (y2 - y1))); 
            g.drawOval(x - 5, y - 5, 10, 10); 
        }
        this.b.draw(g);
    }
    public void drawLine(int x1, int y1, int x2, int y2, Graphics g) {
        Point a = new Point(x1, y1), b = new Point(x2, y2); 
        if (a.distanceTo(b) < 20) { 
        
        } else { 
            int mpx = (x1 + x2) / 2, mpy = (y1 + y2) / 2;
            g.drawOval(mpx-5, mpy-5, 10, 10);
            this.drawLine(x1, y1, mpx, mpy, g); 
            this.drawLine(mpx, mpy, x2, y2, g); 
        }
    }
}