/**
 *
 */
package cotroller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :Controller.java
 * @story  :
*/
public class Controller {
	public static void main(String[] args) {
		Calc calc = new Calc();
		Koup koup = new Koup();
		EndDay ed = new EndDay();
		Num1 n1 = new Num1();
		StudentInfo si = new StudentInfo();
		MaxMin mm = new MaxMin();
		Tax tax = new Tax();
		Gender g = new Gender();
		TimeCalc tc = new TimeCalc();
		Scanner s = new Scanner(System.in);
		String menu = "";

		while (true) {
			menu = JOptionPane.showInputDialog("1.계산기" 
											+ " 2.카우프" 
											+ " 3.년월말" 
											+ " 4.1등 구하기" 
											+ " 5.학번/나이" 
											+ " 6.최고최저점수"
											+ " 7.세금액" 
											+ " 8.성별판별" 
											+ " 9.시분초구하기" 
											+ " 0.종료");

			switch (menu) {
			case "0":
				JOptionPane.showConfirmDialog(null, "종료하시겠습니까?");
				return;
			case "1":
				System.out.println("첫번째 숫자");
				System.out.println("두번째 숫자");
				System.out.println("+, -, *, /, %");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
			case "2":
				System.out.println("이름, 키, 몸무게를 입력해주세요.");
				System.out.println(koup.koup(s.next(), s.nextDouble(), s.nextDouble()));
				break;
			case "3":
				System.out.println("년, 월을 입력해주세요");
				System.out.println(ed.endDay(s.nextInt(), s.nextInt()));
				break;
			case "4":
				System.out.println("이름1, 점수1, 이름2, 점수2, 이름3, 점수3");
				System.out.println(n1.num1(s.next(), s.nextInt(), s.next(), s.nextInt(), s.next(), s.nextInt()));
				break;
			case "5":
				System.out.println("학생수는 몇명인가요?");
				si.sutdentInfo(1, "이름", 20);
				break;
			case "6":
				System.out.println("학생수, 점수 입력해주세요");
				System.out.println(mm.maxMin(s.nextInt(), s.nextInt()));
				break;
			case "7":
				System.out.println("이름, 연봉을 입력하세요.");
				System.out.println(tax.tax(s.next(), s.nextInt()));
				break;
			case "8":
				System.out.println("이름, 주민번호를 입력하세요.");
				System.out.println(g.gender(s.next(), s.next()));
				break;
			case "9":
				System.out.println("몇초인가요?");
				System.out.println(tc.timeCalc(s.nextInt()));
				break;
			default:
				JOptionPane.showMessageDialog(null, "메뉴에 없는 번호입니다.");
				break;
			}
		}
	}
}