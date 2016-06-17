/**
 * 
 */
package school;

import java.util.Calendar;

import javax.swing.JOptionPane;


/**
 * @date   :2016. 6. 16.
 * @author :장종익
 * @file   :SchoolController.java
 * @story  :
*/
public class SchoolController {
	public static void main(String[] args) {
		Student st = null;
		int confirm = 0;
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록, 2.조회, 0종료")) {
			case "1":
				String inputName = JOptionPane.showInputDialog("이름");
				String inputId = JOptionPane.showInputDialog("ID");
				String inputPw = JOptionPane.showInputDialog("비밀번호");
				String inputSsn = JOptionPane.showInputDialog("주민등록번호  - 포함 뒷번호 첫째자리 까지만");
				st = new Student(inputName, inputId, inputPw, inputSsn);
				break;
			case "2":
				JOptionPane.showMessageDialog(null, Student.SCHOOL_NAME + ", 이름 : " + st.getName() + ", 성별 : "
						+ st.getGender() + ", ID : " + st.getId() + ", 등록날짜 : " + st.getRegDate());
				break;
			case "0":
				confirm = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				if (confirm == 0) {
				} else {
					continue;
				}
				return;
			default:
				break;
			}
		}
	}
}