//only in the runtime
public class InvalidAgeException2 extends Exception {

	private String errorMessage;
	private String errorCode;
	
	public InvalidAgeException2(String errorMessage, String errorCode){
		super(errorMessage);
		this.errorCode = errorCode;
		this.errorMessage = errorMessage;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

	
	
	
}
