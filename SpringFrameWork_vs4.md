# JDBC
DB TABLE 생성
```sql
CREATE TABLE member (
email VARCHAR(100) NOT NULL PRIMARY KEY,
pass VARCHAR(100) NOT NULL,
nick VARCHAR(100) NOT NULL,
registeredAt DATETIME NOT NULL DEFAULT CURRENT_TIMESTAMP,
removeAt DATETIME NULL DEFAULT NULL
)ENGINE INNODB DEFAULT CHARSET=UTF8;
```
![](pic/flowset.png)

`MemberVO`
```java
public class MemberVO {
	private String email;
	private String pass;
	private String nick;
	private Timestamp registeredAt;
    private Timestamp removedAt;
    
    //getter, setter, constructor
```
`MemberDAO <<interface>>`
```java
public interface MemberDAO {
	void insert(MemberVO member) throws Exception;
	void update(MemberVO member)throws Exception;
	void delete(String email)throws Exception;
	MemberVO selectByEmail(String email)throws Exception;
	MemberVO selectByEmailPass(String email, String pass)throws Exception;
}
```
`implemnet`
```java
@Repository("memberDAO")
public class MemberDAOImpl implements MemberDAO {
```
`MemberRegister(Service) <<interface>>`
```java
public interface MemberRegister {
	void execute() throws Exception;
}
```
`implement`
```java
@Service("memberRegister")
public class MemberRegisterImpl implements MemberRegister {
```
---
## JdbcTemplate
`DataSource`를 멤버로 가지며 `DataSource`를 이용하여 데이터베이스에 대한 작업을 쉽게 할 수 있도록 기능제공

`Statement`생성과 실행같은 `JDBC` 핵심 작업을 수행 `SQL`문을 실행하거나 `ResultSet`에 대한 반복적인 값의 작업을 수행

---
## RowMapper
![](pic/RowMapper.png)
`RowMapper` 내부에서 자체적으로 `ResultSet` 을 돌려준다.
```java
members = temp.query(sql, new RowMapper<MemberVO>() {
    @Override
    public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
        return new MemberVO(
                rs.getString("email"), 
                rs.getString("pass"), 
                rs.getString("nick"),
                rs.getTimestamp("registeredAt"),
                rs.getTimestamp("removedAt"));
    }
});
return (members.size() == 0 ? null : members.get(0));
```
해당 `interface`와 구현 `service` 생성

`RowMapper`는 `interface` 이므로 사용자의 쓰임에 맞게 구현체 `class` 구성 후 사용
```java
public class MemberVOMapper implements RowMapper<MemberVO>{
//RowMapper는 타입미지정시 Object로 인식하기 때문에 MemberVO로 지정해주어야한다.
	@Override
	public MemberVO mapRow(ResultSet rs, int rowNum) throws SQLException {
		return new MemberVO(
				rs.getString("email"), 
				rs.getString("pass"), 
				rs.getString("nick"),
				rs.getTimestamp("registeredAt"),
				rs.getTimestamp("removeAt"));
	}
}
```
`사용 `
```java
public MemberVO selectByEmail(String email) throws Exception {
    List<MemberVO> members = null;
    String sql ="SELECT * FROM members WHERE email='"+email+"'";
    members = temp.query(sql, new MemberVOMapper());
    return (members.size() == 0 ? null : members.get(0));
}
```
```java
//members = temp.query(sql, new MemberVOMapper());
members = temp.query(sql, new BeanPropertyRowMapper<MemberVO>(MemberVO.class));
//만약 DB와 VO의 멤버명이 같다면 BeanPropertyRowMapper를 이용 이름이 같은 멤버들을 인식하여 받아와준다
```
---
## PreparedStatementCreator
![](pic/PreparedStatementCreator.png)
`ResultSet`을 이용하지 않고 `PreparedStatement`로 바로 받아올 수 있게 해주는 `interface`
```java
members = temp.query(new PreparedStatementCreator() {
    @Override
    public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
        PreparedStatement pstmt = con.prepareStatement("SELECT * FROM members WHERE email=? AND pass=?");
        pstmt.setString(1, email);
        pstmt.setString(2, pass);
        return pstmt;
    }
}, 
new MemberVOMapper());
```

`Custom PreparedStatementCreator`
```java
public class SelectByEmailPassPstmtCreator implements PreparedStatementCreator{
	private String email;
	private String pass;
	public SelectByEmailPassPstmtCreator(String email, String pass) {
		this.email = email;
		this.pass = pass;
	}
	@Override
	public PreparedStatement createPreparedStatement(Connection con) throws SQLException {
		PreparedStatement pstmt = con.prepareStatement("SELECT * FROM members WHERE email=? AND pass=?");
		pstmt.setString(1, email);
		pstmt.setString(2, pass);
		return pstmt;
	}
}
```

