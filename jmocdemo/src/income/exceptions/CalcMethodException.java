package income.exceptions;

public class CalcMethodException extends RuntimeException {
	private static final long SERIAL_VERSION_UID = 1L;
	public CalcMethodException(String message) {
		super(message);
	}
}
