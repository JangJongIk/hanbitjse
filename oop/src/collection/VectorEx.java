package collection;

import java.awt.Button;
import java.awt.Frame;
import java.util.List;
import java.util.Vector;

import school.StudentBean;

/**
 * @date :2016. 6. 23.
 * @author :장종익
 * @file :ListEx.java
 * @story :
 */
public class VectorEx {
	public static void main(String[] args) {
		List<StudentBean> v = new Vector<StudentBean>(2, 5); // (초기용량, 초과시 증가량)
		StudentBean searchTest = null; // 객체가 null인 상태
		StudentBean searchMan = new StudentBean(); // 객체의 속성이 null인 상태
		StudentBean hong = new StudentBean("홍길동", "hong", "1", "800101-1");
		StudentBean kim = new StudentBean("김유신", "kim", "1", "900101-1");
		StudentBean lee = new StudentBean("이순신", "lee", "1", "000101-3");

		// 자원추가
		v.add(hong);
		v.add(kim);
		v.add(lee);
		System.out.println("size : " + v.size());

		String searchName = "이순신";
		searchMan = null;
		for (int i = 0; i < v.size(); i++) {
			if (v.get(i).getName() == searchName) {
				searchMan = v.get(i);
			}
		}

		if (searchMan == null) {
			System.out.println(searchName + " 라는 이름은 없습니다.");
		} else {
			System.out.println(searchMan.toString());
		}

//		if (!searchName.equals(searchMan.getName())) {
//			System.out.println(searchName + " 라는 이름은 없습니다.");
//		} else {
//			System.out.println(searchName.toString()); 이 소스가 더 간지난다
//		}
		
		if (v.contains(searchMan)){		//String이 아닌 Object를 찾는다.
			v.remove(v.indexOf(searchMan));
		} else {
			System.out.println("존재X");
		}
		System.out.println(v.size());	//컬렉션은 toString()을 쓰지않는다. 출력하면 저절로 요소들을 전부 출력한다
	}
}