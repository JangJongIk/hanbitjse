package simpleRPS2;

import javax.swing.JOptionPane;

public class SimpleRpsController {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=====가위바위보 게임=====");
		SimpleRpsService service = new SimpleRpsServiceImpl();

		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO?")) {
			case 0:
				JOptionPane.showMessageDialog(null, service.getResult(service.playGame(JOptionPane.showInputDialog("1가위 2바위 3보"))));
				break;
			default:
				return;
			}
		}
	}
}