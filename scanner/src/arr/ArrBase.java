package arr;

import java.util.Scanner;

/**
 * @date :2016. 6. 9.
 * @author :장종익
 * @file :Num1.java
 * @story :
 */

public class ArrBase {
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
		String[] name = new String[3];
		int[] score = new int[3];
		int i = 0;
		Scanner scanner = new Scanner(System.in);
		
//		System.out.print("1번 학생 이름은?");
//		name[0] = scanner.next();
//		System.out.print(name[0] + "의 점수는?");
//		score[0] = scanner.nextInt();
//		if(score[0] >= 101 || score[0] <= -1){
//			System.out.println("0 ~ 100 중 입력해주세요.");
//			return;
//		}
//		
//		System.out.print("2번 학생 이름은?");
//		name[1] = scanner.next();
//		System.out.print(name[1] + "의 점수는?");
//		score[1] = scanner.nextInt();
//		if(score[1] >= 101 || score[1] <= -1){
//			System.out.println("0 ~ 100 중 입력해주세요.");
//			return;
//		}
//
//		System.out.print("3번 학생 이름은?");
//		name[2] = scanner.next();
//		System.out.print(name[2] + "의 점수는?");
//		score[2] = scanner.nextInt();
//		if(score[2] >= 101 || score[2] <= -1){
//			System.out.println("0 ~ 100 중 입력해주세요.");
//			return;
//		}
//		
		for (; i < name.length; i++) {
			System.out.printf("%d번 학생의 이름은?\n", i+1);
			name[i] = scanner.next();
			System.out.printf("%s의 점수는?\n", name[i]);
			score[i] = scanner.nextInt();
			if(score[i] >= 101 || score[i] <= -1){
				System.out.println("0에서 100중 입력해주세요.");
				continue;
			}
		}

		if (score[0] > score[1] && score[0] > score[2]) {
			if(score[1] > score[2]){
				System.out.println("1등 : " + name[0] + ", 평균점수 : " + score[0] +"\n2등 : "  + name[1] + ", 평균점수 : "  + score[1] + "\n3등 : " + name[2] + ", 평균점수 : " + score[2]);
			} else {
				System.out.println("1등 : " + name[0] + ", 평균점수 : " + score[0] +"\n2등 : "  + name[2] + ", 평균점수 : "  + score[2] + "\n3등 : " + name[1] + ", 평균점수 : " + score[1]);	
			}
			
		} else if (score[1] > score[0] && score[1] > score[2]) {
			if(score[0] > score[2]){
				System.out.println("1등 : " + name[1] + ", 평균점수 : " + score[1] +"\n2등 : "  + name[0] + ", 평균점수 : "  + score[0] + "\n3등 : " + name[2] + ", 평균점수 : " + score[2]);
			} else {
				System.out.println("1등 : " + name[1] + ", 평균점수 : " + score[1] +"\n2등 : "  + name[2] + ", 평균점수 : "  + score[2] + "\n3등 : " + name[0] + ", 평균점수 : " + score[0]);	
			}
			
		} else if (score[2] > score[0] && score[2] > score[0]) {
			if(score[0] > score[1]){
				System.out.println("1등 : " + name[2] + ", 평균점수 : " + score[2] +"\n2등 : "  + name[0] + ", 평균점수 : "  + score[0] + "\n3등 : " + name[1] + ", 평균점수 : " + score[1]);
			} else {
				System.out.println("1등 : " + name[2] + ", 평균점수 : " + score[2] +"\n2등 : "  + name[1] + ", 평균점수 : "  + score[1] + "\n3등 : " + name[0] + ", 평균점수 : " + score[0]);	
			}
		} else {
			System.out.println("동점은 안됩니다.");
			return;
		}
	}
}
