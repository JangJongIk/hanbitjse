/**
 * 
 */
package bank;

import java.util.Random;

/**
 * @date   :2016. 6. 16.
 * @author :장종익
 * @file   :Account.java
 * @story  :
*/
public class Account {
	private int accountNo; // 인스턴스 변수는 초기화를 하지 않는다.
	private int money;
	private String name;
	private String pw;
	private String id; // 속성은 감추고 기능은 드러낸다.(은닉화)
	
	public Account(String name) {
		this.accountNo = (int) (Math.random() * 999999) + 100000;
		this.name = name;
	}
	
	public void setAccountNo() {
		int rn = (int) (Math.random() * 999999) + 100000;
//		if (rn < 1000000){
//			this.accountNo = rn;
//		}
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public void pw(String pw) {
		this.pw = pw;
	}

	public void id(String id) {
		this.id = id;
	}

	public int getAccountNo() {
		return this.accountNo;
	}

	public int getMoney() {
		return this.money;
	}

	public String getName() {
		return this.name;
	}

	public String getPw() {
		return this.pw;
	}

	public String getId() {
		return this.id;
	}
}