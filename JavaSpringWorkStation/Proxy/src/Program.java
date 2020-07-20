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
			//1. proxy�� ������ ���� interface
			//2. �ش� interface�� �����ϴ� class���� �ҷ�����
			//3. invocationHandler�� noname block���� ����
			BookService bookService = new DefaultBookService("������", 25000);
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Exception {
				//��ó�� �۾� ����
				System.out.println("��ó�� �۾�����");
				Object obj = method.invoke(bookService, args);
				System.out.println("��ó�� �۾�����");
				return obj;
			}
		});
		bookservice.print();
	}

}
