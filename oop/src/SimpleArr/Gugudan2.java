package SimpleArr;

/**
 * @date   :2016. 6. 22.
 * @author :장종익
 * @file   :Gugudan2.java
 * @story  :
*/
public class Gugudan2 {
	public static void main(String[] args) {
		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
			}
			System.out.println();
		}
	}
}
