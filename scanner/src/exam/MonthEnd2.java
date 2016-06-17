/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :장종익
 * @file   :MonthEnd.java
 * @story  :
*/
public class MonthEnd2 {
	/**
	 * 년, 월을 입력하면 말일이 몇일인지 알려주는 
	 * 프로그램.
	 * 단, 2월은 29일이고, 나머지 해는 28일로 마감합니다.
	 * 1~12를 벗어난 숫자를 입력하면
	 * 잘못된 입력 값입니다. 라고 뜬다.
	 * */
	/**
	 * 윤년의 조건
	 * 연도를 4를 나눈 값이 0이면 윤년일 수 있다.
	 * 그러나 해당 연수가 100으로 나눠떨어지면 평년이다.
	 * 2000년은 4로 나눈 값이 0이라서 윤년의 조건은 되는데
	 * 다시 이 값이 100으로 나눠 떨어지기 때문에 평년이 되었다.
	 * 평년이라해도 다시 400으로 나눠떨지는 년도는 윤년이다.
	 * */
	public static void main(String[] args) {
		//init
		int month = 0, endDay = 0;
		Scanner scanner = new Scanner(System.in);
		//op
		System.out.println("년을 입력하세요 [ex)2016]");
		int year = scanner.nextInt();
		if (year < 0){
			System.out.println("음수는 안됩니다.");
			return;
		}
		
		System.out.println("월을 입력하세요 [ex)2]");
		month = scanner.nextInt();
		if (month > 12 || month < 1){
			System.out.println("1에서 12까지만");
			return;
		}
		
		switch (month) {
		case 1:case 3:case 5:case 7:case 8:case 10:case 12:
			endDay = 31;
			break;
		case 4:case 6:case 9:case 11:
			endDay = 30;
			break;
		case 2:
			// ()?:; 삼항연산자
			endDay = year % 100 != 0 && year % 4 == 0 || year % 400 == 0 ? 29 : 28;
			break;
		default:
			System.out.println("1에서 12까지만 입력해주세요.");
			return; 
		}
		
		System.out.printf("%d%s %d%s %d%s", year, "년", month, "월", endDay, "일");
	}
}