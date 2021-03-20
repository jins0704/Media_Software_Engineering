package Task1.Home;

abstract public class Home {
    protected double size;
    protected String color;
    protected String roomName;

    abstract public void cleanRoom();

    public void setSize(double size) {
        this.size = size;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public double getSize() {
        return size;
    }

    public String getColor() {
        return color;
    }

    public String getRoomName() {
        return roomName;
    }
}

