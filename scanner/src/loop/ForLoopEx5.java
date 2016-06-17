/**
 * 
 */
package loop;

/**
 * @date   :2016. 6. 13.
 * @author :장종익
 * @file   :ForLoopEx3.java
 * @story  :3의 배수를 제외한 1부터 10까지 수열은? (단, 공차는 1, !, if-else 사용 금지)
*/
public class ForLoopEx5 {
	public static void main(String[] args) {
		int i = 0;

		for(i=1; i<=10; i++){
			if(i % 3 == 0){
				continue;
			}
			System.out.printf("%d\t", i);
		}
		System.out.println("for loop의 바깥");
	}
}