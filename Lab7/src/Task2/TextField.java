package Task2;

public class TextField implements Component{
    private int width;

    public TextField(int width) {
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Drawing text field with width " + width);
    }
}
