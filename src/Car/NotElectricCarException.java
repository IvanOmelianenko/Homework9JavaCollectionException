package Car;

public class NotElectricCarException extends RuntimeException{
    public NotElectricCarException(String message) {
        super(message);
    }
}
