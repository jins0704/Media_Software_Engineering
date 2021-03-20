package Task1.SmartMachine;

public class Door extends SmartMachine{
    private boolean openCheck;
    private boolean closeCheck;
    private String material;

    public void open(){
        System.out.println("Door open");
    }
    public void close(){
        System.out.println("Door close");
    }

    public void setOpenCheck(boolean openCheck) {
        this.openCheck = openCheck;
    }

    public void setCloseCheck(boolean closeCheck) {
        this.closeCheck = closeCheck;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }
}
