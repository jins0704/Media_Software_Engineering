package Task3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class ShapeCanvas extends JComponent {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        //Point
        Point position = new Point();
        Point newPosition = new Point();

        //Circle
        g.setColor(Color.pink);
        Circle circle = new Circle();
        position.setLocation(50,50);
        circle.setRadius(300);
        circle.setPosition(position);
        circle.draw(g);

        //RectOne
        g.setColor(Color.blue);
        Rectangle rectOne = new Rectangle();
        position.move(110,150);
        rectOne.setWidth(70);
        rectOne.setHeight(40);
        rectOne.setPosition(position);
        rectOne.draw(g);

        //RectTwo
        Rectangle rectTwo = rectOne;
        position.move(220,150);
        rectTwo.move(position);
        rectTwo.draw(g);

        //Triangle
        g.setColor(Color.green);
        Triangle triangle = new Triangle();
        Polygon p = new Polygon();
        p.addPoint(200,200);
        p.addPoint(175,270);
        p.addPoint(225,270);
        triangle.setPolygon(p);
        triangle.draw(g);

        //LineOne
        g.setColor(Color.red);
        Line lineOne = new Line();
        position.move(130,290);
        newPosition.setLocation(200,320);
        lineOne.setPosition(position);
        lineOne.setPositionTwo(newPosition);
        lineOne.draw(g);

        //LineTwo
        Line lineTwo = lineOne;
        position.move(270,290);
        lineTwo.draw(g);

        shapes.add(circle);
        shapes.add(rectOne);
        shapes.add(rectTwo);
        shapes.add(triangle);
        shapes.add(lineOne);
        shapes.add(lineTwo);

    }

    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    public static void main(String args[]) {
        JFrame mainFrame = new JFrame("Graphics demo");
        mainFrame.getContentPane().add(new ShapeCanvas());
        mainFrame.pack();
        mainFrame.setVisible(true);
    }

    public void setShapes(ArrayList<Shape> shapes) {
        this.shapes = shapes;
    }

    public ArrayList<Shape> getShapes() {
        return shapes;
    }
}
