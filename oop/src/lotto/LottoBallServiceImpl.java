package lotto;

/**
 * @date   :2016. 6. 24.
 * @author :장종익
 * @file   :LottoBallServiceImpl.java
 * @story  :
*/
public class LottoBallServiceImpl implements LottoBallService {
	LottoServiceImpl impl = new LottoServiceImpl();
	private int[] lotto;
	
	@Override
	public void setLottoBall() {
		LottoBean lot = new LottoBean();
		this.lotto = new int[6];
		int i = 0;
			while (true) {
				int num = lot.getNumber(); // 0대신 식을 채우시오
				if (isDuplication(num) == true) { // 조건문을 채우시오
					continue;
				}
				this.lotto[i] = num; // 이미 중복이 되지 않는걸 알고있다
				i++;

				if (i == lotto.length) { // if문을 완성하시오
					break;
			}
		}
	}

	public boolean isDuplication(int num) { // setLottoBall() 에서 호출
		// 중복방지 (완성)
		for (int i = 0; i < lotto.length; i++) {
			if (lotto[i] == num) {
				return true;
			}
		}
		return false;
	}

	@Override
	public int[] getLottoBall() {
		return lotto;
	}
}