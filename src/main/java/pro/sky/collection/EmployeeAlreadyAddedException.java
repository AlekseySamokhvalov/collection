package pro.sky.collection;

public class EmployeeAlreadyAddedException extends RuntimeException {
    public EmployeeAlreadyAddedException(String s) {
        super(s);
    }
}
