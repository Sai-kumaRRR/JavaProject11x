package ex31_Exception;

public class Lab206_exception_nullpointer {
    public static void main(String[] args) {
        String name = null;
        name.trim(); // java.lang.Null Handle_pointerException
    }
}
