
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BookService bookService = new DefaultBookService("������", 25000);
		//���� Ŭ������ �ٲ��� �ʰ� ������ ���Ŀ� ��� �߰�
		BookService bookService = new DefaultBookServiceProxy("������", 25000);
		
		bookService.print();
		bookService.newPrint();
		
	}

}
