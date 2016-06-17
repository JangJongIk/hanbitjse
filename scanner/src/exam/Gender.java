/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :장종익
 * @file   :Gender.java
 * @story  :
*/
public class Gender {
	/**
	 * 개발자님 저희 사이트는 주민번호 앞자리와
	 * 상별 판별번호만 입력합니다.
	 * 예를 들어 800101-1 까지만 입력하면
	 * 소비자가 자신이 남자인지 여자인지 밝히지 않아도
	 * 자동으로 DB에 저장되는 시스템을 개발해주세요.
	 * [출력문] 홍길동(남)
	 * */
	
	/*1,2 : 국내 1900년대생 남,녀
	3,4 : 국내 2000년대생 남,녀
	5,6 : 외국 1900년대생 남,녀
	7,8 : 외국 2000년대생 남,녀*/
	public static void main(String[] args) {
		String name = "", juNum = "", gender = "";
		char c = ' ';
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("이름을 입력해주세요.");
		name = scanner.next();
		
		System.out.println("주민번호를 입력해주세요 ex)000000-0");
		juNum = scanner.next();
		
		c = juNum.charAt(7);
		
		if (c == '0' || c == '9') {
			System.out.println("0 또는 9는 올 수 없습니다");
			return;
		}
		
		switch(c%2){
		case 0 :
			gender = "여";
			break;
			
		default :
			gender = "남";
			break;
		}
		
		System.out.println(name + "(" + gender + ")");
	}
}
