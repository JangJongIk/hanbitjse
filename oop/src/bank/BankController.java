/**
 * 
 */
package bank;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 15.
 * @author :장종익
 * @file   :BankController.java
 * @story  :
*/
public class BankController {
	public static void main(String[] args) {
		AccountService service = new AccountServiceImpl();
		int ok = 0;
		
		while (true) {
			switch (JOptionPane.showInputDialog("1.개설, 2.입금, 3.조회, 4.출금, 5.통장내역, 6.해지 0.종료")) {
			case "1":
				String spec = JOptionPane.showInputDialog("이름,ID,PW");
				String[] arr = spec.split(",");
				service.openAccount(arr[0], arr[1], arr[2]);
				break;
				
			case "2":
				String inputMoney = JOptionPane.showInputDialog("입금액 입력 : ");
//				account.setMoney(Integer.parseInt(inputMoney));
				service.deposit(Integer.parseInt(inputMoney));
				break;

			case "3":
//				JOptionPane.showMessageDialog(null, service.findAccount());
				break;
				
			case "4":
				String outputMoney = JOptionPane.showInputDialog("출금액 : ");
				JOptionPane.showMessageDialog(null, "잔액 : " + service.withdraw(Integer.parseInt(outputMoney)));
				break;

			case "5":
				JOptionPane.showMessageDialog(null, service.showAccount());
				break;
				
			case "6":
				service.deleteAccount();
				break;

			default:
				ok = JOptionPane.showConfirmDialog(null, "Close?");
				if (ok == 0) {
				} else {
					continue;
				}
				return;
			}
		}
	}
}