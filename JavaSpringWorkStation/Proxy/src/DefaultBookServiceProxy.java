
public class DefaultBookServiceProxy extends DefaultBookService {
	
	public DefaultBookServiceProxy() {}
	public DefaultBookServiceProxy(String title, int price) {
		super(title, price);
	}
	
	public void print() {
		System.out.println("��ó���۾�");
		//������ ��ó�� �۾��� ���⼭ ����
		super.print();
		//������ ��ó�� �۾��� ���⼭ ����
		System.out.println("��ó���۾�");

	}
}
