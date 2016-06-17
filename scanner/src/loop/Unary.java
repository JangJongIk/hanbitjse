/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :장종익
 * @file   :Unary.java
 * @story  :
*/
public class Unary {
	public static void main(String[] args) {
		int c; // c라는 주소값에 메모리를 생성해라
//		c = 1; // c라는 메모리공간에 1을 할당해라
		
		int a = 0, b = 0;
		// k = k + 1;
		int k;
		k = 1;
		
		System.out.printf("a++ = %d\n", a++);
//		System.out.printf("a++ = %d\n", a++);
		System.out.printf("++b = %d", ++b);
	}
}