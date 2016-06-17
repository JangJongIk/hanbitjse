/**
 * 
 */
package arr;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :Num1.java
 * @story  :
*/
public class Num1 {
	/**
	 * 학생 수는 입력받습니다.
	 * 학생의 점수만 입력해서
	 * 최고점과 최저점만 출력하는
	 * 로직을 작성하시오.
	 * */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int count = 0, max = 0, min = 100;
		System.out.println("학생수는?");
		count = scanner.nextInt();
		
		int[] score= new int[count];
		
		System.out.printf("%d명의 점수를 입력해주세요.", count);
		for (int i = 0; i < count; i++){
			score[i] = scanner.nextInt();
			if (score[i] > max){
				max = score[i];
			}
			if (score[i] < min){
				min = score[i];
			}
		}
		System.out.printf("최고점수 : %d\t최저점수 : %d", max, min);
	}
}