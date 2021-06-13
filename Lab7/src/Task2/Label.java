package Task2;

public class Label implements  Component{
    private String text;

    public Label(String text) {
        this.text = text;
    }
    @Override
    public void draw() {
        System.out.println("Label drawn with text: "+ '"' +text + '"');
    }
}
