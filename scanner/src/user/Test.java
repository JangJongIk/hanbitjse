package user;

import java.util.Scanner;

/**
 * @date   :2016. 6. 8.
 * @author :장종익
 * @file   :Test.java
 * @story  :main 메소드 단축키
*/
public class Test {
		//main 메소드 
	public static void main(String[] args) {
		// System 클래스는 하드웨어 제어
		// System.in 키보드의 입력을 받는다
		Scanner scanner = new Scanner(System.in);
		
		// System.out는 입력받은 것을 출력한다
		System.out.println("이름 : [ ]");
		// next() 메소드는 커서를 뜻한다
		System.out.println("이름 : " + scanner.next());
		System.out.println("생년월일 : [ ]");
		System.out.println("생년월일 : " + scanner.next());
	}
}