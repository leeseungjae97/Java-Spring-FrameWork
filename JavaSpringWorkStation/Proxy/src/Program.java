import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
		
		BookService bookservice = (BookService) Proxy.newProxyInstance(
                DefaultBookService.class.getClassLoader(), //1
                new Class[] {BookService.class},//2
                new InvocationHandler() {//3
			//1. proxy가 구현할 상위 interface
			//2. 해당 interface를 구현하는 class들을 불러오고
			//3. invocationHandler를 noname block으로 구현
			BookService bookService = new DefaultBookService("스프링", 25000);
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
				//전처리 작업 수행
				System.out.println("전처리 작업수행");
				Object obj = method.invoke(bookService, args);
				System.out.println("후처리 작업수행");
				return obj;
			}
		});
		bookservice.print();
	}

}
