package simpleRPS2;

import java.util.Random;

public interface SimpleRpsService {
	public abstract String playGame(String player);
	public abstract String getResult(String result);
}