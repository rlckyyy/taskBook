package exception;

public class BookIsNotFoundException extends RuntimeException{
    public BookIsNotFoundException(String message) {
        super(message);
    }
}
