import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//runtime�� �����ϵ��� ����
@Target(ElementType.FIELD)//Field�� �ο� �� �� �ִ� annotation
public @interface InitValue {
	//���� ������ �����Ƿ� marker annotation�� ������ �����Ѵ�.
}
