package Task3;

import java.awt.*;

public class Circle extends Shape{

    private int radius;

    @Override
    public void draw(Graphics g) {
        g.fillOval(position.x, position.y, radius, radius);
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public int getRadius() {
        return radius;
    }
}
