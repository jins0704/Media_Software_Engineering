package Task3;

import java.awt.*;
import java.util.ArrayList;
import javax.swing.*;

public class ShapeCanvas extends JComponent {
    private ArrayList<Shape> shapes = new ArrayList<>();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        for(Shape shape: shapes){
            g.setColor(shape.color);
            shape.draw(g);
        }

    }

    public Dimension getPreferredSize() {
        return new Dimension(400, 400);
    }

    public Dimension getMinimumSize() {
        return getPreferredSize();
    }

    public static void main(String args[]) {

        ShapeCanvas sc = new ShapeCanvas();

        Circle circle = new Circle();
        Rectangle rectOne = new Rectangle();
        Rectangle rectTwo = new Rectangle();
        Triangle triangle = new Triangle();
        Line lineOne = new Line();
        Line lineTwo = new Line();

        circle.setRadius(300);
        circle.setPosition(new Point(50,50));
        circle.color = Color.pink;

        //RectOne
        rectOne.setWidth(70);
        rectOne.setHeight(40);
        rectOne.setPosition(new Point(110,150));
        rectOne.color = Color.blue;

        //RectTwo
        rectTwo.setWidth(70);
        rectTwo.setHeight(40);
        rectTwo.setPosition(new Point(220,150));
        rectTwo.color = Color.blue;

        //Triangle
        Polygon polygon = new Polygon();
        polygon.addPoint(200,200);
        polygon.addPoint(175,270);
        polygon.addPoint(225,270);
        triangle.setPolygon(polygon);
        triangle.color = Color.green;

        //LineOne
        lineOne.setPosition(new Point(130,290));
        lineOne.setPositionTwo(new Point(200,320));
        lineOne.color = Color.red;

        //LineTwo
        lineTwo.setPosition(new Point(270,290));
        lineTwo.setPositionTwo(new Point(200,320));
        lineTwo.color = Color.red;

        sc.shapes.add(circle);
        sc.shapes.add(rectOne);
        sc.shapes.add(rectTwo);
        sc.shapes.add(triangle);
        sc.shapes.add(lineOne);
        sc.shapes.add(lineTwo);

        JFrame mainFrame = new JFrame("Graphics demo");
        mainFrame.getContentPane().add(sc);
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
