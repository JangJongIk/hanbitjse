/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :장종익
 * @file   :ForLoopEx3.java
 * @story  :1부터 10까지 짝수, 홀수의 급수는? 단, 공차는 1
*/
public class ForLoopEx3 {
	public static void main(String[] args) {
		int i = 0, oddSum = 0, evenSum = 0;

		for (i = 1; i <= 10; i++) {
			if (i % 2 == 1) {
				oddSum += i;
			} else if (i % 2 == 0) {
				evenSum += i;
			}
		}
		
		System.out.printf("oddSum = %d\nevenSum = %d", oddSum, evenSum);
	}
}