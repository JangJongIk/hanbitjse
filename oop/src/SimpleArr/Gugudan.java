package SimpleArr;

/**
 * @date   :2016. 6. 22.
 * @author :장종익
 * @file   :Gugudan.java
 * @story  :
*/
public class Gugudan {
	public static void main(String[] args) {
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
			System.out.println();
		}
	}
}
