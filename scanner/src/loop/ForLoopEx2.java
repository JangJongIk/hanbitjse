/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :장종익
 * @file   :ForLoopEx2.java
 * @story  :1부터 10까지 홀수의 급수는?
*/
public class ForLoopEx2 {
	public static void main(String[] args) {
		int i = 0, sum = 0;

		for (i = 1; i <= 10; i+=2) {
			sum += i;
		}
		System.out.println(sum);
	}
}