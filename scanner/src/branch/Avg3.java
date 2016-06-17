package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :장종익
 * @file   :Avg.java
 * @story  :
*/
public class Avg3 {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 국, 영, 수 세과목 점수를 입력받아서
	 * [홍길동 : 총점 ***점, 평균 ***점, 학점 : F]
	 * 을 출력하는 프로그램을 만들어주세요.
	 * 단 평균은 소수점 이하는 절삭합니다.
	 * 평균 점수가 90점 이상이면 A
	 * 80점 이상이면 B
	 * 70점 이상이면 C
	 * 60점 이상이면 D
	 * 50점 이상이면 E
	 * 50점 미만이면 F 입니다 라고
	 * 출력되게 해주세요
	 * 단, switch-case 문을 이용.
	 * */
	public static void main(String[] args) {
		//-----------변수 선언부, 초기화(init)-------------
		String name = "", result = "";
		int kor = 0, eng = 0, math = 0, total = 0, avg = 0, avgD = 0;
		Scanner scanner = new Scanner(System.in);
		//------------------연산부(알고리즘)--------------------
		System.out.println("이름을 입력하세요.");
		name = scanner.next();
		System.out.println("국어 영어 수학 점수는?");
		kor = scanner.nextInt();
		if(kor >= 101 || kor < 0) {
			System.out.println("0에서 100까지만 입력해주세요.");
			return;
		}
		
		eng = scanner.nextInt();
		if(eng >= 101 || eng < 0) {
			System.out.println("0에서 100까지만 입력해주세요.");
			return;
		}
		
		math = scanner.nextInt();
		if(math >= 101 || math < 0) {
			System.out.println("0에서 100까지만 입력해주세요.");
			return;
		}
		
		total = kor + eng + math;
		avg = total / 3;
		
		switch (avg/10) {
		case 10: case 9:
			result = "A";
			break;
		case 8:
			result = "B";
			break;
		case 7:
			result = "C";
			break;
		case 6:
			result = "D";
			break;
		case 5:
			result = "E";
			break;
		default :
			result = "F";
		}
		//---------------------출력부(콘솔)------------------------
		System.out.println(name + " : 총점은 " + total + "점 이며, 평균은 "
				+ avg + "점 입니다." + " 학점 : " + result);
	}
}
