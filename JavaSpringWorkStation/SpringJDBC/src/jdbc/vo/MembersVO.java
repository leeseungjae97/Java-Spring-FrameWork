package jdbc.vo;

public class MembersVO {
	//VO는 database와 이름을 같게해주면 자동으로 연결된다.
	private int id;
	private String email;
	private String pass;
	
	public MembersVO(String email, String pass) {
		this.email = email;
		this.pass = pass;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPass() {
		return pass;
	}

	public void setPass(String pass) {
		this.pass = pass;
	}

	public MembersVO(int id, String email, String pass) {
		super();
		this.id = id;
		this.email = email;
		this.pass = pass;
	}

	@Override
	public String toString() {
		return "MembersVO [id=" + id + ", email=" + email + ", pass=" + pass + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + id;
		result = prime * result + ((pass == null) ? 0 : pass.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		MembersVO other = (MembersVO) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id != other.id)
			return false;
		if (pass == null) {
			if (other.pass != null)
				return false;
		} else if (!pass.equals(other.pass))
			return false;
		return true;
	}

	
}
