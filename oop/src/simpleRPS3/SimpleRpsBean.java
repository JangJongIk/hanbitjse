package simpleRPS3;

import java.util.Random;

public class SimpleRpsBean {
	private int play, comp;
	private String value; // 숫자에 대응하는 가위바위보 값

	public void setPlay(int play) {
		this.play = play;
	}

	public void setComp() {
		Random r = new Random();
		this.comp = r.nextInt(3) + 1;
	}

	public String getValue(int out) {
		switch (out) {
		case 1:
			this.value = "가위";
			break;

		case 2:
			this.value = "바위";
			break;

		case 3:
			this.value = "보";
			break;

		default:
			break;
		}
		return value;
	}

	public int getPlay() {
		return play;
	}

	public int getComp() {
		return comp;
	}

	@Override
	public String toString() {
		return "배팅값 [플레이어=" + play + ", 컴퓨터=" + comp + ", value=" + value + "]";
	}
}