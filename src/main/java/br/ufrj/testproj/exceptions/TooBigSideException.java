package br.ufrj.testproj.exceptions;

public class TooBigSideException extends Exception {

	public TooBigSideException() {

	}

	public TooBigSideException(String message) {
		super(message);
	}

	public TooBigSideException(Throwable cause) {
		super(cause);
	}

	public TooBigSideException(String message, Throwable cause) {
		super(message, cause);
	}

}
