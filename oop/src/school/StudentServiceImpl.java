package school;


/**
 * @date   :2016. 6. 20.
 * @author :장종익
 * @file   :StudentServiceImpl.java
 * @story  :
*/
public class StudentServiceImpl implements StudentService{
	StudentBean st = null;
	@Override
	public void registStudent(String id, String pw, String name, String ssn) {
		st = new StudentBean(name, id, pw, ssn);
	}

	@Override
	public String showStudent() {
		return st.toString();
	}

	@Override
	public void updateStudent(String pw) {
		st.setPw(pw);
	}

	@Override
	public void deleteStudent() {
		st = null;
	}

}
