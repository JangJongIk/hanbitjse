package gameRps;

public class RPSBean {
	private int play, comp;
	private String win, compStr, playStr;

	public RPSBean(int play) {
		this.play = play;
	}

	public void setComp(int comp) {
		this.comp = comp;
	}

	public int getPlay() {
		return this.play;
	}

	public int getComp() {
		return this.comp;
	}

	public String getCompStr() {
		switch (this.comp) {
		case 1:
			this.compStr = "가위";
			break;

		case 2:
			this.compStr = "바위";
			break;
		case 3:
			this.compStr = "보";
			break;
		}
		return this.compStr;
	}

	public String getPlayStr() {
		switch (this.play) {
		case 1:
			this.playStr = "가위";
			break;
		case 2:
			this.playStr = "바위";
			break;
		case 3:
			this.playStr = "보";
			break;
		}
		return this.playStr;
	}

	public void setWin(String win) {
		this.win = win;
	}

	public String getWin() {
		return this.win;
	}

	@Override
	public String toString() {
		return "[플레이어=" + getPlayStr() + ", 컴퓨터=" + getCompStr() + " 결과 : " + getWin() + "]";
	}
}
