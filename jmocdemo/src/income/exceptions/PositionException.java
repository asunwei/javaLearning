package income.exceptions;

public class PositionException extends RuntimeException {
	private static final long SERIAL_VERSION_UID = 1L;
	public PositionException(String message) {
		super(message);
	}
}
