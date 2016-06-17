/**
 * 
 */
package something;

/**
 * @date   :2016. 6. 17.
 * @author :장종익
 * @file   :Info.java
 * @story  :
*/
public class Info {
	private String aaa, bbb;
	private int ccc, ddd;

	public Info(String bbb, int ccc) {
		this.bbb = bbb;
		this.ccc = ccc;
	}

	public void setAAA(String aaa) {
		this.aaa = aaa;
	}

	public void setBBB(String bbb) {
		this.bbb = bbb;
	}

	public void setDDD(int ddd) {
		this.ddd = ddd;
	}

	public String getAAA() {
		return this.aaa;
	}

	public String getBBB() {
		return this.bbb;
	}

	public int getCCC() {
		return this.ccc;
	}

	public int getDDD() {
		return this.ddd;
	}
}
