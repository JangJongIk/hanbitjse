package map;

/**
 * @date   :2016. 6. 28.
 * @author :장종익
 * @file   :MemberBean.java
 * @story  :
*/
public class MemberBean {
	private String id, pwd, name, gender;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPwd() {
		return pwd;
	}

	public void setPwd(String pwd) {
		this.pwd = pwd;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "회원정보 [id=" + id + ", pwd=" + pwd + ", name=" + name + ", gender=" + gender + "]\n";
	}
	
	
}
