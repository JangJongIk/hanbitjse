/**
 * 
 */
package exam;

import java.util.Random;
import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :장종익
 * @file   :OddEven.java
 * @story  :
*/
public class OddEven {
	/**
	 * 개발자님, 홀짝 게임하나 만들어 주세요.
	 * 사용자가 홀인지 짝인지 맞추면
	 * WIN 틀리면 LOOSE가 출력되면 됩니다.
	 * */
	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner = new Scanner(System.in);
		int num = random.nextInt((10) + 1);
		String result = "";

		System.out.println("돈을 거시는데 짝이라고 생각하면 0을" + " 홀이라고 생각하면 1을 입력하시오");
		int userNum = scanner.nextInt();

		if(userNum != 0 && userNum !=1) {
			System.out.println("0이나 1중 입력");
			return;
		} else if (num % 2 == 0 && userNum == 0) {
			result = "WIN";
		} else if (num % 2 == 0 && userNum == 1) {
			result = "LOOSE";
		} else if (num % 2 == 1 && userNum == 0) {
			result = "LOOSE";
		} else if (num % 2 == 1 && userNum == 1) {
			result = "WIN";
		}

		System.out.println(result);
	}
}
