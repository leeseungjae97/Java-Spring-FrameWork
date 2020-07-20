import java.lang.reflect.*;
public class Program {
	public static void main(String[] args) {
		Member member = new Member("홍길동", 20);
		Class<?> cls = member.getClass();
		
		try {
			//class를 reflect로 얻어낸 값을 통해
			//Method method = cls.getDeclaredMethod("setName", String.class);
			Method method2 = cls.getDeclaredMethod("print");
			//arg 1 = Object type
			//arg 2 = 해당 class의 args
			
			//method.invoke(member, "심청이");
			method2.invoke(member);
			
			//private 되어있어도 다 찾는다
			//private를 없애기도 함
			//getter와 setter도 필요없다.
			
			//홍길동이였던 member는 심청이로 바뀐다.
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
