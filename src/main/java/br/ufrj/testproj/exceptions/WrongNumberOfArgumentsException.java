package br.ufrj.testproj.exceptions;

public class WrongNumberOfArgumentsException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public WrongNumberOfArgumentsException() {

	}

	public WrongNumberOfArgumentsException(String message) {
		super(message);
	}

	public WrongNumberOfArgumentsException(Throwable cause) {
		super(cause);
	}

	public WrongNumberOfArgumentsException(String message, Throwable cause) {
		super(message, cause);
	}
}
