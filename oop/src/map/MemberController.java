package map;

import javax.swing.JOptionPane;

/**
 * @date   :2016. 6. 28.
 * @author :장종익
 * @file   :MemberController.java
 * @story  :
*/
public class MemberController {
	public static void main(String[] args) {
		MemberService service = new MemberServiceImpl();
		String temp = "";
		
		while (true){
			switch(JOptionPane.showInputDialog(""
					+ "--- 회원이 보는 화면 ---\n"
					+ "1.회원가입 2.로그인 3.내정보보기 4.내정보수정(비번) 5.탈퇴 0.종료\n"
					+ "--- 관리자 화면 ---\n"
					+ "11.회원목록 12.검색(ID) 13.검색(이름) 14.검색(성별) 15.회원수")){
			case "1":	// 회원가입
				temp = JOptionPane.showInputDialog("ID,PW,name,gender");
				String[] arr = temp.split(",");
				MemberBean bean = new MemberBean();
				bean.setId(arr[0]);
				bean.setPwd(arr[1]);
				bean.setName(arr[2]);
				bean.setGender(arr[3]);
				JOptionPane.showMessageDialog(null, service.join(bean));
				break;
				
			case "2":	// 로그인 
				temp = JOptionPane.showInputDialog("ID,PW");
				String[] arr2 = temp.split(",");
				MemberBean bean2 = new MemberBean();
				bean2.setId(arr2[0]);
				bean2.setPwd(arr2[1]);
				JOptionPane.showMessageDialog(null, service.login(bean2));
				break;
				
			case "3":	// 내정보 보기
				JOptionPane.showMessageDialog(null, service.detail());
				break;
				
			case "4":	// 내정보 수정(비번)
				MemberBean bean3 = new MemberBean();
				bean3.setPwd(JOptionPane.showInputDialog("비밀번호 변경"));
				service.updatePW(bean3);
				break;
				
			case "5":	// 탈퇴
				JOptionPane.showMessageDialog(null, service.delete());
				break;
				
			case "11":	// 회원목록
				JOptionPane.showMessageDialog(null, service.list());
				break;
				
			case "12":	// 검색(ID)
				service.findById(temp);
				break;
				
			case "13":	// 검색(이름)
				String inputName = JOptionPane.showInputDialog("검색할 이름");
				JOptionPane.showMessageDialog(null, service.findByName(inputName));
				break;
				
			case "14":	// 검색(성별)
				String inputGender = JOptionPane.showInputDialog("검색할 성별");
				JOptionPane.showMessageDialog(null, service.countByGender(inputGender));
				break;
				
			case "15":	// 회원수
				service.count();
				break;
				
			case "0":
				return;

			default:
				break;
			}
		}
	}
}
