import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

	public static void main(String[] args) {
		Member member = new Member("��û��", 16);
		Class<?> cls = member.getClass();
		
		Method[] methods = cls.getDeclaredMethods();
		//method�� ����annotation�� ã�����ؼ� reflection�� ����Ѵ�
		for(Method method : methods) {
			DefaultMethod annotation = method.getAnnotation(DefaultMethod.class);
			if(annotation != null) {
				try {
					//DefaultMethod Annotation�� �޷��ִ� Method ȣ��
					method.invoke(member);
					System.out.println("��ó��");
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
