package Task3;

import jdk.nashorn.internal.objects.annotations.Getter;
import jdk.nashorn.internal.objects.annotations.Setter;

import java.awt.*;

abstract public class Shape {

    // where the shape is located on the screen
    protected Point position;
    // the color that is used for drawing the shape
    protected Color color;

    public void move(Point newPosition){
        position = newPosition;
    }

    // draws the shape on canvas. The Graphics g object is passed
// to this method by the paintComponent() method that coordinates
    // the painting.
    abstract public void draw(Graphics g);
// add getters and setters here

    public void setPosition(Point position) {
        this.position = position;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Point getPosition() {
        return position;
    }

    public Color getColor() {
        return color;
    }

}