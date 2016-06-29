package map;

import java.util.ArrayList;
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
		List<MemberBean> entryList = new ArrayList<MemberBean>();
		
		for(Map.Entry<String, MemberBean> entry : map.entrySet()){
			entryList.add(entry.getValue());
		}
		return entryList;
	}

	@Override
	public MemberBean findById(String id) {
		return map.get(id);
	}

	@Override
	public List<MemberBean> findByName(String name) {
		List<MemberBean> temp = new ArrayList<MemberBean>();
		for (String key : map.keySet()) {
			if (name.equals(map.get(key).getName())) {
				temp.add(map.get(key));
			}
		}
		return temp;
	}

	@Override
	public void updatePW(MemberBean bean) {
		session.setPwd(bean.getPwd());
		map.put(session.getId(), session);
	}

	@Override
	public String delete() {
		map.remove(session.getId());
		session = null;
		return "탈퇴완료";
	}

	@Override
	public int countByGender(String gender) {
		int count = 0;
		for (String key : map.keySet()) {
			if (gender.equals(map.get(key).getGender())) {
				count++;
			}
		}
		return count;
	}

	@Override
	public int count() {
		return map.size();
	}
}
