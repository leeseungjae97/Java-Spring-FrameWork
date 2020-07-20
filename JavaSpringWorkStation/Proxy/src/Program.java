
public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//BookService bookService = new DefaultBookService("스프링", 25000);
		//원본 클래스를 바꾸지 않고 이전과 이후에 기능 추가
		BookService bookService = new DefaultBookServiceProxy("스프링", 25000);
		
		bookService.print();
		bookService.newPrint();
		
	}

}
