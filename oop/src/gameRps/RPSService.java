package gameRps;

public interface RPSService {
	public void betPlayerValue(int playerValue);

	public void setComputerValue();

	public void whoWin();

	public String showResult();

	public boolean checkValidation(String rps); // 유효성 체크
}
