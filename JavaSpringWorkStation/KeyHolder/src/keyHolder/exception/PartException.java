package keyHolder.exception;

public abstract class PartException extends RuntimeException {
	//RuntimeException은 JVM이 관여한다.
	//추상화하여 new를하지 못하게 만듬
	public PartException(String message) {
		super(message);
	}
}
