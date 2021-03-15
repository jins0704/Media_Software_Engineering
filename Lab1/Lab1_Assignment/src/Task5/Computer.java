package Task5;

public class Computer {
    private String type;
    private String manufacturer;
    private double battery;
    private double price;

    public Computer(String type, String manufacturer) {
        this.type = type;
        this.manufacturer = manufacturer;
    }

    public void setType(String type){
        if(type !=null && type.length() >0){
            this.type = type;
        }
    }

    public void setManufacturer(String manufacturer){
        if(manufacturer !=null && manufacturer.length() >0){
            this.manufacturer = manufacturer;
        }
    }

    public void setBattery(int battery){
        if(battery>=0) {
            this.battery = battery;
        }
    }

    public void setPrice(String Price){
        if(price>=0) {
            this.price = price;
        }
    }

    public String getType(){
        return type;
    }

    public String getManufacturer(){
        return manufacturer;
    }

    public double battery(){
        return battery;
    }

    public double price(){
        return price;
    }
}
