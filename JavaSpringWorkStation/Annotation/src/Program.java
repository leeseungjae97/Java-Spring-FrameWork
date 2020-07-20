import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class Program {

	public static void main(String[] args) {
		Member member = new Member("심청이", 16);
		Class<?> cls = member.getClass();
		
		Method[] methods = cls.getDeclaredMethods();
		//method에 붙은annotation을 찾기위해선 reflection을 써야한다
		for(Method method : methods) {
			DefaultMethod annotation = method.getAnnotation(DefaultMethod.class);
			if(annotation != null) {
				try {
					//DefaultMethod Annotation이 달려있는 Method 호출
					method.invoke(member);
					System.out.println("후처리");
				} catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
}
