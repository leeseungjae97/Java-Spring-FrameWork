package jdbctemplate.service;

public interface MemberRegister {
	void execute(String email, String pass, String pass2, String nick) throws Exception;
}
