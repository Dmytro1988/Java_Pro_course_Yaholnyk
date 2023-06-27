package app.exception;

public class ProductEmptyException extends RuntimeException{

    public ProductEmptyException(String message) {
        super(message);
    }
}
