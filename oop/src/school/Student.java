/**
 * 
 */
package school;

/**
 * @date   :2016. 6. 16.
 * @author :장종익
 * @file   :Student.java
 * @story  :
*/
public class Student {
	public final static String SCHOOL_NAME = "한빛학원";
	private String id, pw, name, regDate, gender, ssn; // ssn은 주민번호.
	private int age;

	public Student(String name, String id, String pw, String ssn) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.ssn = ssn;
	}
	
	public void setPw(String pw){
		this.pw = pw;
	}

	public void setRegDate(String regDate) {
		this.regDate = regDate;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public String getRegDate() {
		return this.regDate;
	}

	public String getGender() {
		char c = ssn.charAt(7);
		
		switch (c % 2) {
		case 0:
			gender = "여";
			break;
		default:
			gender = "남";
		}
		return this.gender;
	}

	public String getSsn() {
		return this.ssn;
	}

	public int getAge() {
		return this.age;
	}
}
