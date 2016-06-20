/**
 * 
 */
package something;

import javax.swing.JOptionPane;

/**
 * @date :2016. 6. 17.
 * @author :장종익
 * @file :Controller.java
 * @story :
 */
public class Controller { 
	public static void main(String[] args) {
		Info info = null;
		int confirm = 0;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.등록, 2.조회, 0.종료")) {
			case "1":
				info = new Info(JOptionPane.showInputDialog("bbb 문자 입력"),
						Integer.parseInt(JOptionPane.showInputDialog("ccc 값 입력")));
				info.setAAA(JOptionPane.showInputDialog("aaa 문자 입력"));
				info.setDDD(Integer.parseInt(JOptionPane.showInputDialog("ddd 값 입력")));
				break;

			case "2":
				JOptionPane.showMessageDialog(null, "AAA : " + info.getAAA() + ", BBB : " + info.getBBB() + ", CCC : "
						+ info.getCCC() + ", DDD : " + info.getDDD());

			case "0":
				confirm = JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				if (confirm == 0) {
				} else {
					continue;
				}
				return;
			}
		}
	}
}