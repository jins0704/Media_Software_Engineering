package Task3;

import java.awt.*;

public class Rectangle extends Shape{
    private int width;
    private int height;

    @Override
    public void draw(Graphics g) {
        g.fillRect(position.x, position.y, width, height);
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getHeight() {
        return height;
    }

    public int getWidth() {
        return width;
    }
}
