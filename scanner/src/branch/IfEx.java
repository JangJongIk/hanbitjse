/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :장종익
 * @file   :IfEx.java
 * @story  :Branch 구문
*/
public class IfEx {
	public static void main(String[] args) {
		int input = 0;
		Scanner scanner = new Scanner(System.in);

		System.out.println("정수 값 하나를 입력하세요.");

		input = scanner.nextInt();

		if (input == 10) {
			System.out.println("입력된 정수 값 " + input + "이 10입니다.");
		} else {
			System.out.println("입력된 정수 값 " + input + "이 10 아닙니다.");

		}
	}
}
