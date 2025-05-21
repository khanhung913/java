package jp.co.exercise.jp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.TreeMap;

public class Play {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	Random rd = new Random();
	private static final String[] TRUMP_TYPE = { "スペード", "ハート", "ダイヤ", "クラブ" };
	private Map<Integer, String> trumpMap = new TreeMap<Integer, String>();
	private List<String> trumpList = new ArrayList<String>();

	public Play() {
		handleGenerateTrumpMap();
		handleGenerateTrumpList();
	}

	private void handleGenerateTrumpMap() {
		trumpMap.put(11, "J");
		trumpMap.put(12, "Q");
		trumpMap.put(13, "K");
		trumpMap.put(14, "A");
	}

	private void handleGenerateTrumpList() {
		for (int i = 0; i < TRUMP_TYPE.length; i++) {
			for (int j = 2; j < 15; j++) {
				trumpList.add(TRUMP_TYPE[i] + " " + j);
			}
		}
	}

	public String handleTakeTrump(Logic logic) {
		int random = rd.nextInt(trumpList.size());
		String trump = trumpList.get(random);
		trumpList.remove(trump);
		logic.handleAddTrumpToUsedList(trump);
		return trump;

	}

	public String handleRedefinitionTrump(String trump) {
		int trumpNumber = Integer.parseInt(trump.substring(trump.indexOf(" ") + 1));
		String trumpType = trump.substring(0, trump.indexOf(" "));
		return (trumpNumber > 10) ? trumpType + " " + this.trumpMap.get(trumpNumber)
				: trump;
	}

	public String handleProcessPlayerChoice(String playerTrump, Logic logic) {
		for (int j = 2; j >= 1; j--) {
			int num = 0;
			boolean checkPlayerChoice = false;
			do {
				System.out.println("あなたの手札を交換しますか？【残" + j + "回】");
				System.out.println("1:交換");
				System.out.println("2:決定");
				try {
					String playerChoice = br.readLine();
					num = Integer.parseInt(playerChoice);
				} catch (Exception e) {
					System.out.println("入力不正　ー＞　システム終了");
					System.exit(0);
				}
				if (num == 1) {
					System.out.println("あなたの手札は: " + this.handleRedefinitionTrump(playerTrump) + " でした");
					System.out.println("山札から一枚引きます。");
					System.out.println();
					playerTrump = this.handleTakeTrump(logic);
				} else if (num == 2) {
					checkPlayerChoice = true;
				}
				if(num <= 0 || num > 2)
				System.out.println("1か2を入力してください");	
			} while (num <= 0 || num > 2);
			if (checkPlayerChoice)
				break;
		}
		return playerTrump;
	}

	public Map<Integer, String> getTrumpMap() {
		return trumpMap;
	}

}
