package Task2;

import java.awt.*;

public class Main {

    public static void main(String[] args) {
        LinearLayout layout = new LinearLayout(true);
        layout.addComponent(new Button("Start"));
        layout.addComponent(new Label("Test label"));
        LinearLayout layout2 = new LinearLayout(false);
        layout2.addComponent(new TextField(12));
        layout2.addComponent(new TextField(12));
        layout.addComponent(layout2);
        Window wnd = new Window(layout);
        wnd.drawToScreen();
    }
}