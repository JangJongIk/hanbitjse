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
			return "연산자 입력을 똑바로 해주세요.";
		}
		return x + opc + y + " = " + sum;
	}
}
