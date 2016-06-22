package SimpleArr;

/**
 * @date   :2016. 6. 22.
 * @author :장종익
 * @file   :Matrix5.java
 * @story  :
*/
public class Matrix5_2 {
	public static void main(String[] args) {
		int num = 0;
		
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j <= 5 ; j++) {
				System.out.print((num+=5) + "\t");
			}
			System.out.println();
		}
	}
}
