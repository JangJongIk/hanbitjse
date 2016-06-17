/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :장종익
 * @file :Kaup2.java
 * @story :카우푸지수 구하는 프로그램
 */
public class Kaup2 {
	/**
	 * 개발자님 BMI지수가 너무 길어요. 소수점 이하 2자리에서 끊어주세요.
	 */
	public static void main(String[] args) {
		// -------init---------
		Scanner scanner = new Scanner(System.in);
		String name = "", result = "";
		double height = 0.0, weight = 0.0, kaup = 0.0;
		// -------op---------
		System.out.print("이름 : ");
		name = scanner.next();

		System.out.print("키 : ");
		height = scanner.nextDouble();

		System.out.print("몸무게 : ");
		weight = scanner.nextDouble();

		kaup = weight / (height / 100) / (height / 100);

		if (kaup < 18.5) {
			result = "저체중"; // 18.5 보다 작으면
		} else if (kaup > 18.5 && kaup < 23) {
			result = "정상체중"; // 18.5 ~ 22.9
		} else if (kaup > 23 && kaup < 25) {
			result = "위험체중"; // 23 ~ 24.9
		} else if (kaup > 25 && kaup < 30) {
			result = "비만 1단계"; // 25 ~ 29.9
		} else if (kaup > 30 && kaup < 40) {
			result = "비만 2단계"; // 30 ~ 39.9
		} else if (kaup >= 40) {
			result = "비만 3단계"; // 40보다 크거나 같으면
		}

//		double d = Double.parseDouble(String.format("%.2f", kaup));
//		System.out.println(name + "은 BMI지수는 " + d + "이고, " + result + "이다");

		// 위 문장을 printf로 변경하시오.
		System.out.printf("%s은 BMI지수는 %.2f 이고, %s이다.", name, kaup, result);
	}
}
