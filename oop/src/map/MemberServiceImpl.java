package map;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @date   :2016. 6. 28.
 * @author :장종익
 * @file   :MemberServiceImpl.java
 * @story  :
*/
public class MemberServiceImpl implements MemberService{
	Map<String, MemberBean> map;
	MemberBean session;		// 세션으로 로그인유지. 필드에서 유지해준다
	
	public MemberServiceImpl() {
		map = new HashMap<String, MemberBean>();
	}
	
	@Override
	public String join(MemberBean bean) {
		// 1.회원가입
		return (map.containsKey(bean.getId())) ? "중복된 ID" : success(bean);
	}
	
	public String success(MemberBean bean){
		map.put(bean.getId(), bean);
		return "가입성공";
	}
	
	@Override
	public String login(MemberBean bean) {
		String result = "";
		if (map.containsKey(bean.getId())) {
			if (findById(bean.getId()).getPwd().equals(bean.getPwd())) {
				result = "로그인 성공";
				session = findById(bean.getId());
			} else {
				result = "로그인 실패";
			}
		} else {
			result = "ID가 없습니다";
		}
		return result;
	}

	@Override
	public MemberBean detail() {	// 내정보 보기
		return session;
	}

	@Override
	public List<MemberBean> list() {
		return null;
	}

	@Override
	public MemberBean findById(String id) {
		return map.get(id);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		return null;
	}

	@Override
	public void updatePW(MemberBean bean) {
	}

	@Override
	public String delete() {
		return null;
	}

	@Override
	public List<MemberBean> findByGender(String gender) {
		return null;
	}

	@Override
	public int count() {
		return map.size();
	}
}
