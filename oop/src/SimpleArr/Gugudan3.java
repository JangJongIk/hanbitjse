package SimpleArr;

/**
 * @date   :2016. 6. 22.
 * @author :장종익
 * @file   :Gugudan3.java
 * @story  :
*/
public class Gugudan3 {
	public static void main(String[] args) {
//		for (int i = 1; i <= 9; i++) {
//			for (int j = 2; j <= 9; j++) {
//				System.out.print(j + "*" + i + "=" + (i*j) + "\t");
//			}
//			System.out.println();
//		}

		for (int i = 1; i <= 9; i++) {
			for (int j = 2; j <= 5; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
		System.out.println();
		
		for (int i = 1; i <= 9; i++) {
			for (int j = 6; j <= 9; j++) {
				System.out.print(j + "*" + i + "=" + (i * j) + "\t");
			}
			System.out.println();
		}
	}
}
