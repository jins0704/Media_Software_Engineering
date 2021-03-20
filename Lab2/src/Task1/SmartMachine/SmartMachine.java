package Task1.SmartMachine;

public class SmartMachine {
    protected int battery;
    protected String manufacturer;
    protected int price;

    public void powerOn(){
        System.out.println("SmartMachine Power on");
    }

    public void setBattery(int battery) {
        this.battery = battery;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getBattery() {
        return battery;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getPrice() {
        return price;
    }
}
