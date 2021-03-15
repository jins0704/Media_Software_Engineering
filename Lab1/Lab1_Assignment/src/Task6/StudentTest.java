package Task6;

import Task5.Computer;

public class StudentTest {
    public static void main(String[] args){
        Student st1 = new Student();
        st1.setName("Jane Doe");
        st1.setStudentID("123123");
        st1.setGrade(3);
        st1.setMajor("Art");

        Student st2 = new Student();
        st2.setName("Jack Smith");
        st2.setStudentID("232323");
        st2.setGrade(1);
        st2.setMajor("Media");

        Student st3 = new Student();
        st3.setName("John Doe");
        st3.setStudentID("123456789");
        st3.setGrade(4);
        st3.setMajor("Computer");
        st3.setComputer(new Computer("Laptop","Samsung"));

        System.out.println("Name : " + st3.getName());
        System.out.println("ID : " + st3.getStudentID());
        System.out.println("Computer type : " + st3.getComputer().getType());
        System.out.println("Computer manufactor : " + st3.getComputer().getManufacturer());

        st3.addFriend(st1);
        st3.addFriend(st2);

        System.out.println("Friend : ");
        for(int i=0; i< st3.getFriends().size(); i++){
            System.out.println("\t" + st3.getFriends().get(i).getName());
        }

        System.out.println("Friends after removal: ");
        st3.removeFriend(st1);

        for(int i=0; i< st3.getFriends().size(); i++){
            System.out.println("\t" + st3.getFriends().get(i).getName());
        }

    }
}
