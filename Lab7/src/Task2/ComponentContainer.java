package Task2;

import java.util.ArrayList;
import java.util.List;

abstract public class ComponentContainer implements Component{
    public List<Component> myComponents = new ArrayList<Component>();

    public void addComponent(Component component){
         myComponents.add(component);
    }
}
