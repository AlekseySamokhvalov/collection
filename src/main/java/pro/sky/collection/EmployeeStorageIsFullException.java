package pro.sky.collection;

public class EmployeeStorageIsFullException extends RuntimeException  {
    public EmployeeStorageIsFullException(String s) {
        super(s);
    }
}
