package collection;

import java.util.HashSet;
import java.util.Set;

import school.StudentBean;

/**
 * @date   :2016. 6. 23.
 * @author :장종익
 * @file   :SetEx.java
 * @story  :
*/
public class HashSetEx {
	public static void main(String[] args) {
//		String[] str = {"Java", "Beans", "Java", "XML"};

		Set<StudentBean> stu = new HashSet<StudentBean>();
		
		StudentBean hong = new StudentBean("홍길동", "hong", "1", "800101-1");
		StudentBean kim = new StudentBean("김유신", "kim", "1", "900101-1");
		StudentBean lee = new StudentBean("이순신", "lee", "1", "000101-3");

		stu.add(hong);
		stu.add(kim);
		stu.add(lee);
		
		System.out.println(stu.toString());

	}
}
