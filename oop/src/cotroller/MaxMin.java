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
public class MaxMin {
	/**
	 * 학생 수는 입력받습니다.
	 * 학생의 점수만 입력해서
	 * 최고점과 최저점만 출력하는
	 * 로직을 작성하시오.
	 * */
	public String maxMin(int[] score) {
		int max = 0, min = 100;

		for (int i = 0; i < score.length; i++) {
			if (score[i] > max) {
				max = score[i];
			}
			if (score[i] < min) {
				min = score[i];
			}
		}
		return "최고점수 : " + max + " 최저점수 : " + min;
	}
}