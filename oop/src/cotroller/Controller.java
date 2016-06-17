/**
 * 
 */
package cotroller;

import java.util.Scanner;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 15.
 * @author :장종익
 * @file   :Controller.java
 * @story  :
*/
public class Controller {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		Calc calc = new Calc();
		MaxMin mm = new MaxMin();
		
		while (true){
			System.out.println("[메뉴]"
					+ "1.계산기"
					+ " 2.Koup"
					+ " 3.최고최저점수"
					+ " 0.종료");
			switch (s.next()) {
			case "1": 
				System.out.println("num1, opcode, num2 입력하시오.");
				System.out.println(calc.execute(s.nextInt(), s.next(), s.nextInt()));
				break;
				
			case "2": break;
			case "3":
				System.out.println("학생수는?");
				int count = s.nextInt();
				int[] score = new int[count];
				System.out.printf("%d명의 점수를 입력해주세요.", count);
				for (int i = 0; i < count; i++) {
					score[i] = s.nextInt();
				}
				System.out.println(mm.maxMin(score));
				break;
				
			case "0": 
				JOptionPane.showConfirmDialog(null, "Closing Ok?");
				return;
				
			default :
				break;
			}
		}
	}
}