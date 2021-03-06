package phone;

public class Phone {
	private String company, call;
	public final static String KIND = "유선전화기";
	
	public void setCompany(String company) {
		this.company = company;
	}
	
	public void setCall(String call) {
		this.call = call;
	}
	
	public String getCompany() {
		return company;
	}
	
	public String getCall() {
		return call;
	}

	@Override
	public String toString() {
		return KIND + "인 " +  company + "제품을 가지고, " + call + "(이)라고 통화했다.";
	}
}