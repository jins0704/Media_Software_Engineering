package Task1.SmartMachine;

public class Vacuum extends SmartMachine{
    private String color;
    private int powerLevel;
    private String type;

    public void autoClean(){
        System.out.println("Vacuum clean auto");
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPowerLevel(int powerLevel) {
        this.powerLevel = powerLevel;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getColor() {
        return color;
    }

    public int getPowerLevel() {
        return powerLevel;
    }

    public String getType() {
        return type;
    }
}
