/**
 * 
 */
package cotroller;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :Gender.java
 * @story  :
*/
public class Gender {
	public String gender(String nameInput, String juInput){
		String name = "", juNum = "", gender = "";
		char c = ' ';
		Scanner scanner = new Scanner(System.in);
		
		name = nameInput;
		juNum = juInput;
		
		c = juNum.charAt(7);
		
		if (c == '0' || c == '9') {
			return "0또는 9는 올 수 없습니다.";
		}
		
		switch(c%2){
		case 0 :
			gender = "여";
			break;
			
		default :
			gender = "남";
			break;
		}
		
		return name + "(" + gender + ")";
	}
}
