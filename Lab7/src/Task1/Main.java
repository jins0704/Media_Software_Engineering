package Task1;

public class Main {

    public static void main(String[] args) {
        Student[] students = new Student[] {
                new Student(5763, "John", 22, "Computer Science"),
                new Student(7456, "Jane", 21, "Media"),
                new Student(7742, "Jack", 23, "Media")
        };

        StudentCollection sc = new StudentCollection(students);

        // TEST 1. normal iteration

        Iterator i = sc.getIterator();

        while(i.hasNext()) {
            //System.out.println((Student)i.next());
            Student student = (Student)i.next();
            System.out.println("Student: " + student.getId() + ", " + student.getName() + ", " + student.getAge() + ", " + student.getMajor());
        }

        System.out.println("-------------------");

        // TEST 2. reverse iteration. We can re-use the same iterator.
        while(i.hasPrevious()) {
            //System.out.println((Student)i.previous());
            Student student = (Student)i.previous();
            System.out.println("Student: " + student.getId() + ", " + student.getName() + ", " + student.getAge() + ", " + student.getMajor());
        }

        System.out.println("-------------------");

        // TEST 3. go to the end and reverse again
        i.goToLast();
        while(i.hasPrevious()) {
            //System.out.println((Student)i.previous());
            Student student = (Student)i.previous();
            System.out.println("Student: " + student.getId() + ", " + student.getName() + ", " + student.getAge() + ", " + student.getMajor());
        }
    }
}
