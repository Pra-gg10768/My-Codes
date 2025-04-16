//make the necessary change to make this class a Exception
public class StationNotAvailableException extends Exception {
    private static final long serialVersionUID = 1L;

    public StationNotAvailableException(String message) {
        super(message);
    }
}
