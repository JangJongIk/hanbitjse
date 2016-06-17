/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :장종익
 * @file   :ForLoopEx.java
 * @story  :
*/
public class ForLoopEx {
	
	public static void main(String[] args) {
		int i = 0, sum = 0;

		for (i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}