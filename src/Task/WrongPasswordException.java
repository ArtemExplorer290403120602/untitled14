package Task;

public class WrongPasswordException extends Exception{
    public WrongPasswordException(){
        super("Некоректные данные");
    }

    public WrongPasswordException(String message){
        super(message);
    }
}
