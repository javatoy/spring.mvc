package spring.mvc;

public class SpringMVCException extends RuntimeException {

	private static final long serialVersionUID = 7457420479223136349L;

	public SpringMVCException() {
		super();
	}

	public SpringMVCException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public SpringMVCException(String message, Throwable cause) {
		super(message, cause);
	}

	public SpringMVCException(String message) {
		super(message);
	}

	public SpringMVCException(Throwable cause) {
		super(cause);
	}

}
