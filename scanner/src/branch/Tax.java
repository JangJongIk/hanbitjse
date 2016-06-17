/**
 * 
 */
package branch;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :장종익
 * @file   :Tax.java
 * @story  :
*/
public class Tax {
	/**
	 * 클라이언트에서 프로그램 개발 요청이 왔습니다.
	 * 이름과 연봉을 입력받아서
	 * 연봉 ***만원을 받으시는 xxx님께서 납부할 세금은 ???만원입니다.
	 * 로 출력하는 프로그램을 만들어 주세요.
	 * 단 세율이 정책이 바뀔 때 마다 변하니,
	 * 관리자가 쉽게 적용가능하도록 만들어 주세요.
	 * 현재는 세율이 9.7프로인데, 만약 세율이 바뀌면 
	 * 바뀐 세율을 적용바랍니다.
	 */
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int money = 0, sal = 0, i = 0;
		double taxRate = 0.0;
		
		System.out.println("이름을 입력하세요.");
		String name = scanner.next();
		
		System.out.println("연봉은 얼마인가요?");
		sal = scanner.nextInt();		
		
		System.out.println("세율이 바뀌었습니까?"
				+ " 바뀌었으면 1, 안바뀌었으면 0을 입력하세요.");
		
		i = scanner.nextInt();
		
		if (i == 0) {
			taxRate = 0.097;
		} else {
			System.out.println("그럼, 바뀐 세율을 입력바랍니다.");
			taxRate = scanner.nextDouble();
		}
		
		money = (int) (sal * taxRate);
		System.out.println("연봉을 " + sal + "원 받으시는 " + name + "님께서 "
				+ "납부할 세금은 " + money + "원 입니다.");	
	}
}