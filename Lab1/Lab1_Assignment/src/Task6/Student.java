package Task6;

import Task5.Computer;

import java.util.ArrayList;

public class Student {
    private String name;
    private String studentID;
    private Computer computer;
    private ArrayList<Student> friends= new ArrayList<>();
    private int grade;
    private String major;

    public void setName(String name) {

        this.name = name;
    }

    public void setStudentID(String studentID) {

        this.studentID = studentID;
    }

    public void setComputer(Computer computer) {
        this.computer = computer;
    }

    public void setGrade(int grade) {
        if(grade >0){
            this.grade = grade;
        }
    }

    public void setMajor(String major) {
        if(major != null && major.length() !=0) {
            this.major = major;
        }
    }

    public String getName(){
        return name;
    }

    public String getStudentID() {
        return studentID;
    }

    public Computer getComputer() {
        return computer;
    }

    public int getGrade(){
        return grade;
    }

    public String getMajor(){
        return major;
    }

    public ArrayList<Student> getFriends(){
        return friends;
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
