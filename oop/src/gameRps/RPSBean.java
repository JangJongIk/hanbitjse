package gameRps;

public class RPSBean {
	private String play, comp;

	public void setPlay(String play){
		this.play = play;
	}
	
	public void setComp(String comp){
		this.comp = comp;
	}
	
	public String getPlay(){
		return this.play;
	}
	
	public String getComp(){
		return this.comp;
	}
	
	@Override
	public String toString() {
		return "결과 [플레이어=" + play + ", 컴퓨터=" + comp + "]";
	}
	
}
