package simpleRPS1;

import java.util.Random;

import javax.swing.JOptionPane;

public class SimpleRpsController {
	public static void main(String[] args) {
		JOptionPane.showMessageDialog(null, "=====가위바위보 게임=====");
		SimpleRpsService service = new SimpleRpsServiceImpl();
		int comp = 0, player = 0;
		String result = "";
		Random r = new Random();

		while (true) {
			switch (JOptionPane.showConfirmDialog(null, "GO?")) {
			case 0:
				String p = JOptionPane.showInputDialog("1가위 2바위 3보");
				result = service.gameEngine(result, r, p);
				JOptionPane.showMessageDialog(null, result);
				break;
			default:
				return;
			}
		}
	}
}