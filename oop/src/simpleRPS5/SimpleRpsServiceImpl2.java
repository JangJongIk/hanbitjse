package simpleRPS5;

import java.util.Random;

public class SimpleRpsServiceImpl2 implements SimpleRpsService {
	SimpleRpsBean rps = new SimpleRpsBean();

	@Override
	public String playGame(int player) {
		String result = "", winner = "";
		rps.setPlay(player);
		rps.setComp();
		int com = rps.getComp();
		int ply = rps.getPlay();
		int win = 0;
		
		if (com == ply) {
			result = "WIN";
		} else {
			result = "LOSE";
		}
//		
//		switch (Math.abs(ply-com)) {
//		case 1:
//			result = (ply > com) ? "WIN" : "LOSE";
//			break;
//			
//		case 2:
//			result = (ply > com) ? "LOSE" : "WIN";
//			break;
//
//		default:
//			break;
//		}
		return result;
	}

	@Override
	public String getResult(String result) {
		return "플레이어 : " + rps.getValue(rps.getPlay()) + "\n" + "컴퓨터 : " + rps.getValue(rps.getComp()) + "\n"
				+ "결과 : " + this.playGame(rps.getPlay());
	}
}