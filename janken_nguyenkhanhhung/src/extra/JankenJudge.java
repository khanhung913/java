package extra;

import java.util.ArrayList;
import java.util.Map;

public class JankenJudge {
	private int playerHand;
	private int computerHand;
	private int playerWin = 0;
	private int computerWin = 0;
	private String[] janken = { "グー", "チョキ", "パー" };

	public JankenJudge() {
	}

	public void checkJanken(Map<String, Integer> jankenMapList, Player player, int[][] jankenHistory, int i,
			int numbersOfComputer) {
		for (String key : jankenMapList.keySet()) {
			System.out.println(key + " : " + janken[jankenMapList.get(key)]);
		}
		if (!jankenMapList.containsValue(0)) {
			if (jankenMapList.get("Player") == 1) {
				System.out.println("プレイヤー勝ち");
				playerWin++;
			} else {
				System.out.println("プレイヤー負け");
				computerWin++;
			}
		} else if (!jankenMapList.containsValue(1)) {
			if (jankenMapList.get("Player") == 2) {
				System.out.println("プレイヤー勝ち");
				playerWin++;
			} else {
				System.out.println("プレイヤー負け");
				computerWin++;
			}
		} else {
			if (jankenMapList.get("Player") == 0) {
				System.out.println("プレイヤー勝ち");
				playerWin++;
			} else {
				System.out.println("プレイヤー負け");
				computerWin++;
			}
		}
	}

	public void historyOutput(int[][] jankenHistory, int jankenNumber, int computerNumber) {
		System.out.println("+++++++++++「じゃんけん歴史」+++++++++++");
		System.out.print("\t\t");
		for (int i = 0; i < computerNumber; i++) {
			System.out.print("\tComputer" + (i + 1));
		}
		System.out.print("\tPlayer");
		System.out.println();
		for (int i = 0; i < jankenNumber; i++) {
			System.out.print((i + 1) + "回目");
			for (int j = 0; j <= computerNumber; j++) {
				System.out.print("\t\t" + janken[jankenHistory[i][j]]);
			}
			System.out.println();
		}
	}

	public void checkAllResult() {
		System.out.print(playerWin + "対" + computerWin + "で");
		if (playerWin > computerWin)
			System.out.print("プレイヤーの勝ちです。");
		else if (playerWin < computerWin)
			System.out.println("コンピューターの勝ちです。");
		else
			System.out.println("引き分けです。");
	}

	public boolean checkDraw(Map<String, Integer> jankenList) {
		ArrayList<String> checkList = new ArrayList<String>();
		if (jankenList.containsValue(0))
			checkList.add("guu");
		if (jankenList.containsValue(1))
			checkList.add("choki");
		if (jankenList.containsValue(2))
			checkList.add("pa");
		if (checkList.size() == 2) {
			return true;
		} else
			return false;
	}

	public void handleInput(Player player, Map<String, Integer> jankenMapList, int[][] jankenHistory, int i,
			int numbersOfComputer) {
		boolean check = false;
		do {
			System.out.println("---------『" + (i + 1) + "回目』--------");
			System.out.println("プレイヤーの手を決めてください");
			System.out.println("(グー:0、チョキ:1、パー:2)");
			int playerHand = player.playerHandInput();
			jankenMapList.put("Player", playerHand);
			jankenHistory[i][numbersOfComputer] = playerHand;
			for (int j = 0; j < numbersOfComputer; j++) {
				int computerChoiceHand;
				if (i == 0) {
					computerChoiceHand = player.computerChoiceHand();
				} else {
					computerChoiceHand = player.computerChoiceHand(jankenHistory, i, j, numbersOfComputer);
				}
				jankenHistory[i][j] = computerChoiceHand;
				jankenMapList.put("Computer" + (j + 1), computerChoiceHand);
			}
			check = checkDraw(jankenMapList);
			if (!check) {
				for (String key : jankenMapList.keySet()) {
					System.out.println(key + " : " + janken[jankenMapList.get(key)]);
				}
				System.out.println("あいこです。再プレイ");
				jankenMapList.clear();
			}
		} while (!check);
	}

	public int getPlayerHand() {
		return playerHand;
	}

	public void setPlayerHand(int playerHand) {
		this.playerHand = playerHand;
	}

	public int getComputerHand() {
		return computerHand;
	}

	public void setComputerHand(int computerHand) {
		this.computerHand = computerHand;
	}

}
