package Task1.SmartMachine;

public class Light extends SmartMachine{
    private boolean lightOnCheck;
    private boolean lightOffCheck;
    private String lightColor;

    public void lightOn(){
        System.out.println("light On");
    }
    public void lightOff(){
        System.out.println("light Off");
    }

    public void setLightOnCheck(boolean lightOnCheck) {
        this.lightOnCheck = lightOnCheck;
    }

    public void setLightOffCheck(boolean lightOffCheck) {
        this.lightOffCheck = lightOffCheck;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
    }

    public String getLightColor() {
        return lightColor;
    }
}
