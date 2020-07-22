package jdbc.dao;

import java.util.List;

import jdbc.vo.MembersVO;


public interface MembersDAO {
	void insert(MembersVO member);
	void update(MembersVO member);
	void delete(String email);
	MembersVO selectById(int id);
	List<MembersVO> selectAll();
}
