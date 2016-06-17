/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :장종익
 * @file   :Calc.java
 * @story  :
*/
public class Calc3 {
	/*
	 *  두개의 정수를 입력받아서
	 *  opcode 값이 1이면 덧셈
	 *  2면 뺄셈
	 *  3이면 곱셈
	 *  4면 나눗셈(몫)
	 *  5면 나머지 구하는 계산기
	 */
	public static void main(String[] args) {
		String cal = "", opc = "";
		int x = 0, y = 0, sum = 0;
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("첫번째 숫자");
		x = scanner.nextInt();
		
		System.out.println("두번째 숫자");
		y = scanner.nextInt();
		
		System.out.print("+, -, *, /, %");
		opc = scanner.next();
			
		switch (opc) {
		case "+":
			sum = x + y;
			cal = " + ";
			break;			
		case "-":
			sum = x - y;
			cal = " - ";
			break;
		case "*":
			sum = x * y;
			cal = " * ";
			break;
		case "/":
			sum = x / y;
			cal = " / ";
			break;
		case "%":
			sum = x % y;
			cal = " % ";
			break;
		default:
			System.out.println("연산자는 1에서 5까지만 입력하세요.");
			return;
		}
		
		System.out.println(x + cal + y + " = " + sum);
	}
}