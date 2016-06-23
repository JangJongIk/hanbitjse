package collection;

import java.util.*;

import school.StudentBean;

/**
 * @date   :2016. 6. 23.
 * @author :장종익
 * @file   :ListEx.java
 * @story  :
*/
public class VectorEx {
	public static void main(String[] args) {
		List<StudentBean> v = new Vector<StudentBean>(2, 5);
		StudentBean hong = new StudentBean("홍길동", "hong", "1", "800101-1");
		StudentBean kim = new StudentBean("김유신", "kim", "1", "900101-1");
		StudentBean lee = new StudentBean("이순신", "lee", "1", "000101-3");

		// 자원추가
		v.add(hong);
		v.add(kim);
		v.add(lee);
		System.out.println("size : " + v.size());
//		System.out.println(v.toString());
		
		for (int i = 0; i < v.size(); i++) {
			System.out.println(v.get(i).getName());
			
		}
	}
}