/**
 * 
 */
package kaup;

import java.util.Scanner;

/**
 * @date   :2016. 6. 10.
 * @author :장종익
 * @file :Kaup2.java
 * @story :카우푸지수 구하는 프로그램
 */
public class Kaup {
	String name, height, weight;
	
	public void setName(String name){ //write
		this.name = name;
	}
	
	public void setHeight(String height){
		this.height = height;
	}
	
	public void setWeight(String weight){
		this.weight = weight;
	}
	
	public String getName(){
		return this.name;
	}

	public String getHeight(){
		return this.height;
	}
	
	public String getWeight(){
		return this.weight;
	}
	
	public void saveDB(String n, String h, String w){
		String name = n, result = "";
		double height = Double.parseDouble(h), 
				weight = Double.parseDouble(w), 
				kaup = 0.0;
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

	}
	/**
	 * 개발자님 BMI지수가 너무 길어요. 소수점 이하 2자리에서 끊어주세요.
	 */
	public String kaup() {
		// -------init---------
		String result = "";
		double height = Double.parseDouble(this.height), weight = Double.parseDouble(this.weight), kaup = 0.0;
		// -------op---------
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
		return name + "의 BMI지수는 " + Double.parseDouble(String.format("%.2f", kaup)) + "이고, " + result + "이다";
	}
}
