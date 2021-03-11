import java.util.ArrayList;

public class Student {
    private String name;
    private int studentID;
    //private Computer computer;
    private ArrayList<Student> friends;
    private double grade;
    private int age;

    //encapsulation
    //setter
    public void setName(String name) {
        this.name = name;
    }

    public void setStudentID(int studentID) {
        this.name = name;
    }

//    public void setComputer(Computer comptuer) {
//        this.computer = computer;
//    }
    public void setGrade(double grade) {
        if(grade >=0){
            this.grade = grade;
        }
    }

    public void setAge(int age) {
        if(age>=0) {
            this.age = age;
        }
    }
    //getter

    public String getName(){
        return name;
    }

    public int getStudentID() {
        return studentID;
    }

//    public int getComputer() {
//        return computer;
//    }

    public double getGrade(){
        return grade;
    }

    public int getAge(){
        return age;
    }

    public boolean addFriend(Student newFriend){
        if(newFriend == null || friends.contains(newFriend)){
            return false;
        }
        else{
            friends.add(newFriend);
            return true;
        }

    }
    public boolean removeFriend(Student friend){
        if(friend == null || !friends.contains(friend)){
            return false;
        }
        else{
            friends.remove(friend);
            return true;
        }
    }
}
