/**
 * 
 */
package cotroller;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :Num1.java
 * @story  :
*/
public class Num1 {
	public String num1(String nInput1, int scInput1, String nInput2, int scInput2, String nInput3, int scInput3){
		String name1 = "", name2 = "", name3 = "";
		int score1 = 0, score2 = 0, score3 = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		name1 = nInput1;
		score1 = scInput2;
		if(score1 >= 101 || score1 <= -1){
			return "0~100중 입력해주세요.";
		}
		
		name2 = nInput2;
		score2 = scInput2;
		if(score2 >= 101 || score2 <= -1){
			return "0~100중 입력해주세요.";
		}

		name3 = nInput3;
		score3 = scInput3;
		if(score3 >= 101 || score3 <= -1){
			return "0~100중 입력해주세요.";
		}

		if (score1 > score2 && score1 > score3) {
			if(score2 > score3){
				return "1등 : " + name1 + ", 평균점수 : " + score1 +"\n2등 : "  + name2 + ", 평균점수 : "  + score2 + "\n3등 : " + name3 + ", 평균점수 : " + score3;
			} else {
				return "1등 : " + name1 + ", 평균점수 : " + score1 +"\n2등 : "  + name3 + ", 평균점수 : "  + score3 + "\n3등 : " + name2 + ", 평균점수 : " + score2;	
			}
			
		} else if (score2 > score1 && score2 > score3) {
			if(score1 > score3){
				return "1등 : " + name2 + ", 평균점수 : " + score2 +"\n2등 : "  + name1 + ", 평균점수 : "  + score1 + "\n3등 : " + name3 + ", 평균점수 : " + score3;
			} else {
				return "1등 : " + name2 + ", 평균점수 : " + score2 +"\n2등 : "  + name3 + ", 평균점수 : "  + score3 + "\n3등 : " + name1 + ", 평균점수 : " + score1;	
			}
			
		} else if (score3 > score1 && score3 > score1) {
			if(score1 > score2){
				return "1등 : " + name3 + ", 평균점수 : " + score3 +"\n2등 : "  + name1 + ", 평균점수 : "  + score1 + "\n3등 : " + name2 + ", 평균점수 : " + score2;
			} else {
				return "1등 : " + name3 + ", 평균점수 : " + score3 +"\n2등 : "  + name2 + ", 평균점수 : "  + score2 + "\n3등 : " + name1 + ", 평균점수 : " + score1;	
			}
		} else {
			return "동점은 안됩니다.";
		}
	}
}
