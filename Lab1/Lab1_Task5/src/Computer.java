public class Computer {
    private String brand;
    private int age;
    private String description;

    public void setBrand(String name){
        this.brand = brand;
    }

    public void setAge(int age){
        if(age>=0) {
            this.age = age;
        }
    }

    public void setDescription(String age){
        this.description = description;
    }

    public String getBrand(){
        return brand;
    }

    public int getAge(){
        return age;
    }

    public String getDescription(){
        return description;
    }
}
