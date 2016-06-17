/**
 * 
 */
package cotroller;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :Tax.java
 * @story  :
*/
public class Tax {
	public String tax(String nameInput, int salInput){
		String name;
		int sal = 0, money = 0; // 연봉, 세금
		double taxRate = 0.097;
		
		name = nameInput;
		sal = salInput;
		money = (int) (sal * taxRate);
		return "연봉을 " + sal + "원 받으시는 " + name + "님께서 "
				+ "납부할 세금은 " + money + "원 입니다.";
	}
}
