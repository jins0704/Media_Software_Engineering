package Task1;

import java.util.ArrayList;
import java.util.List;

public class StudentCollection {

    private Student[] students;

    public StudentCollection(Student[] students) {
        this.students = students;
    }

    public StudentIterator getIterator(){
        return new StudentIterator(students);
    }
}
