package gameRps;

import java.util.Random;

public class RPSServiceImpl implements RPSService{
	RPSBean rps;
	
	@Override
	public void betPlayerValue(int playerValue) {
	}

	@Override
	public void setComputerValue() {
		Random r = new Random();
		int computerValue = r.nextInt(3)+1;
	}

	@Override
	public void whoWin() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String showResult() {
		return null;
	}

	@Override
	public boolean checkValidation(String rps) {
		switch (rps) {
		case "1":
		case "2":
		case "3":
			return true;
		default:
			return false;
		}
	}
}
