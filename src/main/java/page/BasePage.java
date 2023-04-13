package page;

import java.util.Random;

public class BasePage {

	public int generateRandomNum(int boundaryNum) {
		Random rnd = new Random();
	int generateNum = 	rnd.nextInt(boundaryNum);
		return  generateNum;
	}
}
