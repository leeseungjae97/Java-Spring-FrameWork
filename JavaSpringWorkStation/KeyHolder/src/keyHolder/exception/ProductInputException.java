package keyHolder.exception;

public class ProductInputException extends ProductException{
	public final static String MSG="등록에 실패 하였습니다.";
	
	public ProductInputException() {
		super(MSG);
	}
	public ProductInputException(String message) {
		super(message);
	}
}
