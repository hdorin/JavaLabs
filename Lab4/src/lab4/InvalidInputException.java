package lab4;

class InvalidInputException extends Exception {
	private static final long serialVersionUID = 1L;
	public InvalidInputException(String message) {
		super(message);
	}
	public InvalidInputException(String message,Throwable cause) {
		super(message,cause);
		
	}
	
}
