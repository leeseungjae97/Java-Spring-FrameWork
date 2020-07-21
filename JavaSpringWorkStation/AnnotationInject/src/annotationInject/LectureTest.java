package annotationInject;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("LectureTest2")
@Scope("prototype")
public class LectureTest implements Test{
	@Value("100")
	private int kor;
	@Value("80")
	private int eng;
	@Value("90")
	private int math;
	public int getKor() {
		return kor;
	}
	public void setKor(int kor) {
		this.kor = kor;
	}
	public int getEng() {
		return eng;
	}
	public void setEng(int eng) {
		this.eng = eng;
	}
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public Test getTest() {
		return this;
	}
	public LectureTest(int kor, int eng, int math) {
		super();
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	@Override
	public String toString() {
		return "LectureTest [kor=" + kor + ", eng=" + eng + ", math=" + math + "]";
	}
	public LectureTest() {}
}
