package br.ufrj.testproj.exceptions;

public class WrongArgsNumberException extends Exception {

	public WrongArgsNumberException() {

	}

	public WrongArgsNumberException(String message) {
		super(message);
	}

	public WrongArgsNumberException(Throwable cause) {
		super(cause);
	}

	public WrongArgsNumberException(String message, Throwable cause) {
		super(message, cause);
	}

}
