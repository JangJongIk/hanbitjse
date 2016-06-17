/**
 * 
 */
package exam;

import java.util.Scanner;

/**
 * @date :2016. 6. 10.
 * @author :장종익
 * @file :bmi.java
 * @story :카우푸지수 구하는 프로그램
 */
public class Kaup {
	/**
	 * 개발자님 프로그램 제작의뢰입니다. 
	 * 비만지수를 구하는 것인데요 
	 * 키와 몸무게를 입력하면 
	 * 당사자가 비만인지 저체중인지 
	 * 알려주는 프로그램을 만들어 주세요 
	 * 돈은 입금했습니다. 
	 * 잘은 모르는데 bmi 공식을 쓰면 된다고 하네요. 
	 * 공식은 나도 몰라요 알아서 하삼.....
	 */
	public static void main(String[] args) {
		String name = "", result = "";
		double weight = 0.0, height = 0.0, bmi = 0.0;

		Scanner scanner = new Scanner(System.in);

		System.out.println("이름은? ");
		name = scanner.next();

		System.out.println("키는 몇인가요? ");
		height = scanner.nextDouble();
		if (height <= 0) {
			System.out.println("0cm 이하는 없어요");
			return;
		}

		System.out.println("몸무게는 몇인가요? ");
		weight = scanner.nextDouble();
		if (weight <= 0) {
			System.out.println("0kg 이하는 없어요");
			return;
		}

		bmi = weight / (height / 100) / (height / 100);

		if (bmi < 18.5) {
			result = "저체중"; // 18.5 보다 작으면
		} else if (bmi > 18.5 && bmi < 23) {
			result = "정상체중"; // 18.5 ~ 22.9
		} else if (bmi > 23 && bmi < 25) {
			result = "위험체중"; // 23 ~ 24.9
		} else if (bmi > 25 && bmi < 30) {
			result = "비만 1단계"; // 25 ~ 29.9
		} else if (bmi > 30 && bmi < 40) {
			result = "비만 2단계"; // 30 ~ 39.9
		} else if (bmi > 40){
			result = "비만 3단계"; // 40보다 크거나 같으면
		}

		System.out.println(name + "님은 " + result + " 이며\nBMI지수는 " + bmi + " 입니다.");
	}
}
