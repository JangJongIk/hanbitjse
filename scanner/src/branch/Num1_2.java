package branch;

import java.util.Scanner;

/**
 * @date :2016. 6. 9.
 * @author :장종익
 * @file :Num1.java
 * @story :
 */

public class Num1_2 {
	/**
	 * 저희 반은 학생 수가 3명입니다.
	 * 학생의 평균 점수는 0~100점 사이입니다.
	 * 3명의 평균점수를 입력하면
	 * 1등 홍길동, 평균점수 **점
	 * 2등 김유신, 평균점수 **점
	 * 3등 김구, 평균점수 **점
	 * 이렇게 나오도록 해주세요. 동점은 없습니다.
	 * 단, 학생이름은 스캐너로 입력받습니다.
	 * */
	public static void main(String[] args) {
		String name = "", name1 = "", name2 = "", name3 = "";
		int score = 0, score1 = 0, score2 = 0, score3 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("1번 학생 이름은?");
		name1 = scanner.next();
		System.out.print(name1 + "의 점수는?");
		score1 = scanner.nextInt();
		if(score1 >= 101 || score1 <= -1){
			System.out.println("0 ~ 100 중 입력해주세요.");
			return;
		}
		
		System.out.print("2번 학생 이름은?");
		name2 = scanner.next();
		System.out.print(name2 + "의 점수는?");
		score2 = scanner.nextInt();
		if(score2 >= 101 || score2 <= -1){
			System.out.println("0 ~ 100 중 입력해주세요.");
			return;
		}

		System.out.print("3번 학생 이름은?");
		name3 = scanner.next();
		System.out.print(name3 + "의 점수는?");
		score3 = scanner.nextInt();
		if(score3 >= 101 || score3 <= -1){
			System.out.println("0 ~ 100 중 입력해주세요.");
			return;
		}

		if (score1 > score2 && score1 > score3) {
			if(score2 > score3){
				System.out.println("1등 : " + name1 + ", 평균점수 : " + score1 +"\n2등 : "  + name2 + ", 평균점수 : "  + score2 + "\n3등 : " + name3 + ", 평균점수 : " + score3);
			} else {
				System.out.println("1등 : " + name1 + ", 평균점수 : " + score1 +"\n2등 : "  + name3 + ", 평균점수 : "  + score3 + "\n3등 : " + name2 + ", 평균점수 : " + score2);	
			}
			
		} else if (score2 > score1 && score2 > score3) {
			if(score1 > score3){
				System.out.println("1등 : " + name2 + ", 평균점수 : " + score2 +"\n2등 : "  + name1 + ", 평균점수 : "  + score1 + "\n3등 : " + name3 + ", 평균점수 : " + score3);
			} else {
				System.out.println("1등 : " + name2 + ", 평균점수 : " + score2 +"\n2등 : "  + name3 + ", 평균점수 : "  + score3 + "\n3등 : " + name1 + ", 평균점수 : " + score1);	
			}
			
		} else if (score3 > score1 && score3 > score1) {
			if(score1 > score2){
				System.out.println("1등 : " + name3 + ", 평균점수 : " + score3 +"\n2등 : "  + name1 + ", 평균점수 : "  + score1 + "\n3등 : " + name2 + ", 평균점수 : " + score2);
			} else {
				System.out.println("1등 : " + name3 + ", 평균점수 : " + score3 +"\n2등 : "  + name2 + ", 평균점수 : "  + score2 + "\n3등 : " + name1 + ", 평균점수 : " + score1);	
			}
		} else {
			System.out.println("동점은 안됩니다.");
		}
	}
}
