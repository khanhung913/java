package excellence;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Player {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Random rd = new Random();

	public Player() {

	}

	public int playerHandInput() {
		int playerChoice = 0;
		do {
			String tempPlayerChoice;
			try {
				tempPlayerChoice = br.readLine();
				playerChoice = Integer.parseInt(tempPlayerChoice);
			} catch (NumberFormatException | IOException c) {
				System.out.println("システムエラーが発生しました。");
				System.out.println("システムが終了です。");
				System.exit(0);
			}
			if (playerChoice < 0 || playerChoice > 2)
				System.out.println("0～2を選択してください");
		} while (playerChoice < 0 || playerChoice > 2);
		return playerChoice;
	}

	public int computerChoiceHand() {

		return rd.nextInt(3);
	}

	public int choiceNumbersOfJanken() {
		int numbersOfJanken = 0;
		do {
			String tempNumbersOfChoice;
			try {
				tempNumbersOfChoice = br.readLine();
				numbersOfJanken = Integer.parseInt(tempNumbersOfChoice);
			} catch (NumberFormatException | IOException c) {
				System.out.println("システムエラーが発生しました。");
				System.out.println("システムが終了です。");
				System.exit(0);
			}
			if (numbersOfJanken < 1) {
				System.out.println("回数をもう一度入力してください");
			}
		} while (numbersOfJanken < 1);
		return numbersOfJanken;
	}

}
