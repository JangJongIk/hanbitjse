package map;

/**
 * @date   :2016. 6. 29.
 * @author :장종익
 * @file   :StringEx.java
 * @story  :
*/
public class StringEx {
	public static void main(String[] args) {
		String name1 = "홍길동";
		String name2 = "홍길동";	//같은 값이면 상수풀에 새로 생성하지 않고 같은 주소를 참조함

		if (name1.equals(name2)) {
			System.out.println("name1 == name2 은 true");
		} else {
			System.out.println("name1 == name2 은 false");
		}

		String name3 = new String("홍길동");
		String name4 = new String("홍길동");

		if (name3.equals(name4)) {	// 주소값을 비교하지 않는다
			System.out.println("name3 == name4 은 true");
		} else {
			System.out.println("name3 == name4 은 false");
		}
	}
}
