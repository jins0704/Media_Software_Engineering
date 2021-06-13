package Task1;

public class StudentIterator implements  Iterator{
    Student[] students;
    int position = 0;

    public StudentIterator(Student[] students) {
        this.students = students;
    }

    @Override
    public boolean hasNext() {

        if(position >= students.length || students[position] == null){
            position = position -1;
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public Object next() {
        Student student = students[position];
        position = position + 1;
        return student;
    }

    @Override
    public Object previous() {
        Student student = students[position];
        position = position - 1;
        return student;
    }

    @Override
    public boolean hasPrevious() {

        if(position < 0|| students[position] == null){
            position = position + 1;
            return false;
        }
        else{
            return true;
        }
    }

    @Override
    public void goToFirst() {
        position = 0;
    }

    @Override
    public void goToLast() {
        position = students.length-1;
    }
}
