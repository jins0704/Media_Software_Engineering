package Task2;

import java.util.ArrayList;
import java.util.List;

public class LinearLayout extends ComponentContainer{
    private Boolean direction;

    public LinearLayout(Boolean direction) {
        this.direction = direction;
    }

    @Override
    public void draw() {
        if(direction){
            System.out.println("Linear layout starts drawing. Drawing components horizontally");
        }
        else{
            System.out.println("Linear layout starts drawing. Drawing components vertically");
        }
        for(int i=0; i<myComponents.size(); i++){
            myComponents.get(i).draw();
        }
        System.out.println("Linear layout finishes drawing.");

    }
}
