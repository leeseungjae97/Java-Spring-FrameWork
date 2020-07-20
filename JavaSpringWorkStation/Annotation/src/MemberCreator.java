import java.lang.reflect.Field;

public class MemberCreator {
	public static Member getInstance(){
		Member member = new Member();
		Class<?> cls = member.getClass();
		Field[] fields = cls.getDeclaredFields();
		for(Field field : fields) {
			//InitValue annotation이 붙어있는 변수 저장
			InitValue annotation = field.getDeclaredAnnotation(InitValue.class);
			if(annotation != null) {
				field.setAccessible(true);
				if(field.getType() == String.class){
					String value2 = annotation.value2();
					try {
						field.set(member, value2);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				if(field.getType() == int.class) {
					int value = annotation.value();
					try {
						field.set(member, value);
					} catch (IllegalArgumentException | IllegalAccessException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
				
			}
		}
		return member;
	}
}
