import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Retention(RetentionPolicy.RUNTIME)//runtime에 동작하도록 설정
@Target(ElementType.FIELD)//Field에 부여 할 수 있는 annotation
public @interface InitValue {
	//내부 내용이 없으므로 marker annotation의 역할을 수행한다.
}
