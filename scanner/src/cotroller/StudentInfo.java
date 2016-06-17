/**
 * 
 */
package cotroller;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :StudentInfo.java
 * @story  :
*/
public class StudentInfo {
	public void sutdentInfo(int countInput, String nameInput, int ageInput){
		/**
		 * 전교생이 몇명인지 몰라요.
		 * 전교생 수를 입력받고
		 * 학생의 이름과 나이를
		 * 입력받고, 이것을 출력하세요
		 */
		Scanner scanner = new Scanner(System.in);
		int i = 0, count = 0;
		count = countInput;
		
		String[] name = new String[count];
		int[] age = new int[count];
		
		for (; i < count; i++) {
			System.out.printf("%d번의 이름, 나이를 입력하세요\n", i+1);
			name[i] = nameInput;
			age[i] = ageInput;
		}
		System.out.print("==================================\n");
		System.out.print("학번|이름|나이\n");
		System.out.print("==================================\n");
		
		for (i = 0; i < count; i++) {
			System.out.printf("%d|%s|%d\n", i+1, name[i], age[i]);
		}
	}
}
