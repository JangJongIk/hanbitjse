/**
 * 
 */
package school;

import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 16.
 * @author :장종익
 * @file   :Student.java
 * @story  :
*/
public class Student {
	public final static String SCHOOL_NAME = "한빛학원";
	private String id, pw, name, regDate, gender, ssn;
	private int age;

	public Student(String name, String id, String pw, String ssn) {
		this.name = name;
		this.id = id;
		this.pw = pw;
		this.ssn = ssn;
		this.gender = null;
		this.regDate = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
		String[] arr = new String[2];

		arr = ssn.split("-");

		if (Integer.parseInt(arr[1]) == 0 || Integer.parseInt(arr[1]) == 9) {
			JOptionPane.showMessageDialog(null, "뒷자리에 0이나 9는 올 수 없습니다.");
		}

		switch (Integer.parseInt(arr[1]) % 2) {
		case 1:
			this.gender = "남";
			break;
		default:
			this.gender = "여";
			break;
		}
	}

	public void setPw(String pw) {
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
		return this.gender;
	}

	public String getSsn() {
		return this.ssn;
	}

	public int getAge() {
		return this.age;
	}
}
