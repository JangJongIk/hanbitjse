package simpleRPS4;

import java.util.Random;

public interface SimpleRpsService {
	public abstract String playGame(int player);
	public abstract String getResult(String result);
}