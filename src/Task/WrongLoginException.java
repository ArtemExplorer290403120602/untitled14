package Task;

public class WrongLoginException extends Exception{
    public WrongLoginException() {
        super("Некорректный логин");
    }

    public WrongLoginException(String message) {
        super(message);
    }
}
