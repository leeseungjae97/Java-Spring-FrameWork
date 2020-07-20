
public class DefaultBookServiceProxy extends DefaultBookService {
	
	public DefaultBookServiceProxy() {}
	public DefaultBookServiceProxy(String title, int price) {
		super(title, price);
	}
	
	public void print() {
		System.out.println("전처리작업");
		//이전의 전처리 작업을 여기서 수행
		super.print();
		//이후의 후처리 작업을 여기서 수행
		System.out.println("후처리작업");

	}
}
