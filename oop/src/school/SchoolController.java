/**
 * 
 */
package school;

import java.util.Calendar;

import javax.swing.JOptionPane;

import global.MyConstants;


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
				st = new Student(JOptionPane.showInputDialog("이름"), JOptionPane.showInputDialog("ID")
						, JOptionPane.showInputDialog("비밀번호"), JOptionPane.showInputDialog("주민등록번호  - 포함 뒷번호 첫째자리 까지만"));
				break;
			case "2":
				JOptionPane.showMessageDialog(null, MyConstants.SCHOOL_NAME + ", " + st.toString());
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