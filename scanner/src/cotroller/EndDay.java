/**
 * 
 */
package cotroller;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :EndDay.java
 * @story  :
*/
public class EndDay {
	public String endDay(int yearInput, int monInput){
		// init
		int endDay = 0;
		// op
		int year = yearInput;
		int month = monInput;

		switch (month) {
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			endDay = 31;
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			endDay = 30;
			break;
		case 2:
			// ()?:; 삼항연산자
			endDay = year % 100 != 0 && year % 4 == 0 || year % 400 == 0 ? 29 : 28;
			break;
		default:
			System.out.println("1에서 12까지만 입력해주세요");
			break;
		}
		return year + "년 " + month + "월은 " + endDay + "일까지 있습니다";
	}
}
