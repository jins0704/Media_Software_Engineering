package Task2;

public class Button implements Component{

    private String text;

    public Button(String text) {
        this.text = text;
    }

    @Override
    public void draw() {
        System.out.println("Drawing button with text: "+ '"' +text + '"');
    }
}
