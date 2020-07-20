import java.lang.reflect.*;
public class Program {
	public static void main(String[] args) {
		Member member = new Member("ȫ�浿", 20);
		Class<?> cls = member.getClass();
		
		try {
			//class�� reflect�� �� ���� ����
			//Method method = cls.getDeclaredMethod("setName", String.class);
			Method method2 = cls.getDeclaredMethod("print");
			//arg 1 = Object type
			//arg 2 = �ش� class�� args
			
			//method.invoke(member, "��û��");
			method2.invoke(member);
			
			//private �Ǿ��־ �� ã�´�
			//private�� ���ֱ⵵ ��
			//getter�� setter�� �ʿ����.
			
			//ȫ�浿�̿��� member�� ��û�̷� �ٲ��.
		} catch (NoSuchMethodException | SecurityException | IllegalAccessException | IllegalArgumentException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
