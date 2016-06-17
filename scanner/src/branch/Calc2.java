/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 9.
 * @author :장종익
 * @file   :Calc2.java
 * @story  :
*/
public class Calc2 {
	public static void main(String[] args) {
		int x = 0, y = 0, sum = 0, opc = 0;
		String cal = "";
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자 : ");
		x = scanner.nextInt();
		
		System.out.println("1:+, 2:-, 3:*, 4:/, 5:%");
		opc = scanner.nextInt();
		
		System.out.println("두번째 숫자 : ");
		y = scanner.nextInt();
		
		if (opc == 1) {
			sum = x + y;
			cal = " + ";
		} else if (opc == 2){
			sum = x - y;
			cal = " - ";
		} else if (opc == 3){
			sum = x * y;
			cal = " * ";
		} else if (opc == 4){
			sum = x / y;
			cal = " / ";
		} else if (opc == 5){
			sum = x % y;
			cal = " % ";
		} else {
			System.out.println("연산자는 1~5 중에 입력하세요.");
			return;
		}
		System.out.println(x + cal + y + " = " + sum);
	}
}
