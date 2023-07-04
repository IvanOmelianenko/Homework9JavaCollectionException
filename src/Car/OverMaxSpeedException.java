package Car;

public class OverMaxSpeedException extends RuntimeException{
    public OverMaxSpeedException(String message) {
        super(message);
    }
}
