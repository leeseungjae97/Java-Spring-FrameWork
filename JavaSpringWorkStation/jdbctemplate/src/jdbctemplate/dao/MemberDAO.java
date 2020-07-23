package jdbctemplate.dao;

import java.util.List;

import jdbctemplate.vo.MemberVO;

public interface MemberDAO {
	void insert(MemberVO member) throws Exception;
	void update(MemberVO member)throws Exception;
	void delete(String email)throws Exception;
	MemberVO selectByEmail(String email)throws Exception;
	MemberVO selectByEmailPass(String email, String pass)throws Exception;
	//DB에서 제공하는 복호화를 사용하면 비교할 방법이 없어진다
	//가져올떄 password도 같이 가져와 비교하자
	List<MemberVO> selectList(String column, String str)throws Exception;
	//email 문자열을 이용하여 해당 colume에서 search
}
