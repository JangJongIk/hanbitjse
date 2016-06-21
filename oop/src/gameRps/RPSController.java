package gameRps;

import javax.swing.JOptionPane;

public class RPSController {
	public static void main(String[] args) {
		RPSService service = new RPSServiceImpl();

		while (true) {
			switch (JOptionPane.showInputDialog("1.계속, 2.종료")) {
			case "1":
				String rps = JOptionPane.showInputDialog("1.가위 2.바위 3.보");
				if (service.checkValidation(rps)) {
					service.betPlayerValue(Integer.parseInt(rps));
					service.setComputerValue();
					service.whoWin();
					JOptionPane.showMessageDialog(null, service.showResult());
				} else {
					JOptionPane.showMessageDialog(null, "1~3만 가능");
					continue;
				}
				break;

			case "2":
				if (JOptionPane.showConfirmDialog(null, "Close?") == 0) {
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