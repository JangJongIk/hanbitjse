/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :ForLoopEx6.java
 * @story  :init=0, limit=10, diff=1인 reverse sequences
*/
public class ForLoopEx6 {
	public static void main(String[] args) {
		int i = 0;
	
		for(i = 10; i > -1; i-=2){
			System.out.printf("%d\t", i);
		}
	}
}
