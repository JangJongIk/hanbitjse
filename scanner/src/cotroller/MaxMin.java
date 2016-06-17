/**
 * 
 */
package cotroller;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :MaxMin.java
 * @story  :
*/
public class MaxMin {
	public String maxMin(int countInput, int scoreInput){
		int count = 0, max = 0, min = 100;
		count = countInput;
		
		int[] score= new int[count];
		
		for (int i = 0; i < count; i++){
			score[i] = scoreInput;
			if (score[i] > max){
				max = score[i];
			}
			if (score[i] < min){
				min = score[i];
			}
		}
//		System.out.printf("최고점수 : %d\t최저점수 : %d", max, min);
		return "최고점수 : " + max + " 최저점수 : " + min;
	}
}
