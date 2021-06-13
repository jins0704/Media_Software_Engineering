package Task2;

public class Window {
    Component rootComponent;

    public Window(Component rootComponent) {
        this.rootComponent = rootComponent;
    }

    void drawToScreen(){
        System.out.println("Drawing window to screen");
        System.out.println("Drawing borders of the window");
        if(rootComponent != null) {
            System.out.println("Calling draw() on root component");
            rootComponent.draw();
        }
        System.out.println("Finished drawing window.");
    }
}
