package Task3;

import java.awt.*;

public class Line extends Shape{

    private Point positionTwo;

    @Override
    public void draw(Graphics g) {
        g.drawLine(position.x, position.y, positionTwo.x, positionTwo.y);
    }

    public void setPositionTwo(Point positionTwo) {
        this.positionTwo = positionTwo;
    }

    public Point getPositionTwo() {
        return positionTwo;
    }

}
