package gameRps;

import java.util.Random;

public class RPSServiceImpl implements RPSService {
	RPSBean rps;

	@Override
	public void betPlayerValue(int playerValue) {
		rps = new RPSBean(playerValue);
	}

	@Override
	public void setComputerValue() {
		Random r = new Random();
		rps.setComp(r.nextInt(3)+1);
	}

	@Override
	public void whoWin() {
		switch (rps.getPlay() - rps.getComp()) {
		case -1: case 2:
			rps.setWin("loose");
			break;
		case 0:
			rps.setWin("draw");
			break;
		case 1: case-2:
			rps.setWin("win");
			break;
		}
	}

	@Override
	public String showResult() {
		return rps.toString();
	}

	@Override
	public boolean checkValidation(String rps) {
		int rpsB = Integer.parseInt(rps);
		return rpsB == 1 || rpsB == 2 || rpsB == 3 ? true : false;

	}
}