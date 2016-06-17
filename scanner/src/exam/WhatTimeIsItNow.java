/**
 * 
 */
package exam;

import java.text.SimpleDateFormat;

/**
 * @date   :2016. 6. 17.
 * @author :장종익
 * @file   :WhatTimeIsItNow.java
 * @story  :
*/
public class WhatTimeIsItNow {
	public static void main(String[] args) {
		String now = new SimpleDateFormat("yyyy-MM-dd").format(System.currentTimeMillis());
		System.out.println(now);
		
		String[] arr = new String[3];
		arr = now.split("-");
		System.out.println(arr[0]);
		for (String string : arr) {
			System.out.println(string);
		}
	}
}
