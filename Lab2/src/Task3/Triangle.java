package Task3;

import java.awt.*;

public class Triangle extends Shape{

    Polygon polygon;

    @Override
    public void draw(Graphics g) {
        g.fillPolygon(polygon);
    }

    public void setPolygon(Polygon polygon) {
        this.polygon = polygon;
    }

    public Polygon getPolygon() {
        return polygon;
    }
}
