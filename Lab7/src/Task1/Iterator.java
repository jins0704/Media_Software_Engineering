package Task1;

public interface Iterator {
    boolean hasNext();
    Object next();
    Object previous();
    boolean hasPrevious();
    void goToFirst(); // move to the first index
    void goToLast(); // move to the last index
}
