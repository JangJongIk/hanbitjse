/**
 * 
 */
package loop;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :Num1ForLoop.java
 * @story  :
*/
public class Num1ForLoop {
	public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);
	int[] score = new int[3];
	int[] grade = new int[3];
	String[] name = new String[3];
	int i = 0;
	
	for(; i < name.length; i++){
		System.out.println("이름은?");
		name[i] = scanner.next();
		System.out.println("점수는?");
		score[i] = scanner.nextInt();
		if(score[i] < 0 || score[i] > 100){
			System.out.println("0에서 100까지만 입력해주세요");
			return;
			}
		}
	}
}
