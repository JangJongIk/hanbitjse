/**
 * 
 */
package cotroller;

import java.util.Scanner;

/**
 * @date   :2016. 6. 14.
 * @author :장종익
 * @file   :TimeCalc.java
 * @story  :
*/
public class TimeCalc {
	public String timeCalc(int secInput){
		int sec = 0;
		sec = secInput;
		
		return ((sec / 86400) % 3600 + "일 " + (sec / 3600) % 24 + "시간 "
		+ (sec / 60) % 60 + "분 " + (sec % 60) + "초 ");
	}
}
