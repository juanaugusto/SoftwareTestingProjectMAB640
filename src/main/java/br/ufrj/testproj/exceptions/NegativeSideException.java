package br.ufrj.testproj.exceptions;

public class NegativeSideException extends Exception {

	public NegativeSideException() {

	}

	public NegativeSideException(String message) {
		super(message);
	}

	public NegativeSideException(Throwable cause) {
		super(cause);
	}

	public NegativeSideException(String message, Throwable cause) {
		super(message, cause);
	}
}
