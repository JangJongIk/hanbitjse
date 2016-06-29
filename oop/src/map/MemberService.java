package map;

import java.util.List;

/**
 * @date   :2016. 6. 28.
 * @author :장종익
 * @file   :MemberService.java
 * @story  :
*/

public interface MemberService {
	public String join(MemberBean bean);	// 회원가입
	public String login(MemberBean bean);	// 로그인
	public MemberBean detail();	// 마이페이지
	public void updatePW(MemberBean bean);	//	내정보수정 (비번)
	public MemberBean findById(String id); // ID로 검색
	public List<MemberBean> list(); // 회원목록
	public List<MemberBean> findByName(String name); // 이름으로 검색
	public String delete();	// 탈퇴
	public int countByGender(String gender); 	//성별로 회원 수 
	public int count();	//회원수
} 