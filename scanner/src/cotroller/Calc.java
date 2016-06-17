/**
 * 
 */
package cotroller;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :opcc.java
 * @story  :
*/
public class Calc {
	public String execute(int inputNum1, String opcode, int inputNum2){
		String opc = "";
		int x = 0, y = 0, sum = 0;

		x = inputNum1;
		opc = opcode;
		y = inputNum2;

		switch (opc) {
		case "+":
			sum = x + y;
			opc = " + ";
			break;
		case "-":
			sum = x - y;
			opc = " - ";
			break;
		case "*":
			sum = x * y;
			opc = " * ";
			break;
		case "/":
			sum = x / y;
			opc = " / ";
			break;
		case "%":
			sum = x % y;
			opc = " % ";
			break;
		default:
			System.out.println("연산자는 1에서 5까지만 입력하세요.");
			break;
		}
		return x + opc + y + " = " + sum;
	}
}
