package jp.co.exercise.jp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Logic {
	private int playerWin = 0;
	private int computerWin = 0;
	private List<Integer> spadeList = new ArrayList<Integer>();
	private List<Integer> heartList = new ArrayList<Integer>();
	private List<Integer> diamondList = new ArrayList<Integer>();
	private List<Integer> clubList = new ArrayList<Integer>();

	public void handleAddTrumpToUsedList(String trump) {
		String trumpType = trump.substring(0, trump.indexOf(" "));
		int trumpNumber = this.getTrumpNumber(trump);
		if (trumpType.equals("スペード"))
			spadeList.add(trumpNumber);
		else if (trumpType.equals("ハート"))
			heartList.add(trumpNumber);
		else if (trumpType.equals("ダイヤ"))
			diamondList.add(trumpNumber);
		else
			clubList.add(trumpNumber);
	}

	public int getTrumpNumber(String trump) {
		return Integer.parseInt(trump.substring(trump.indexOf(" ") + 1));
	}

	private void handleSortTrumpList() {
		Collections.sort(spadeList);
		Collections.sort(heartList);
		Collections.sort(diamondList);
		Collections.sort(clubList);
	}

	public void handlePrintUsedTrump(Map<Integer, String> trumpMap) {
		handleSortTrumpList();
		System.out.print("スペード：");
		for (Integer integer : spadeList) {
			if (integer > 10) {
				System.out.print(trumpMap.get(integer) + "　");
			} else
				System.out.print(integer + "　");
		}
		System.out.println();
		System.out.print("ハート\t：");
		for (Integer integer : heartList) {
			if (integer > 10) {
				System.out.print(trumpMap.get(integer) + "　");
			} else
				System.out.print(integer + "　");
		}
		System.out.println();
		System.out.print("ダイヤ\t：");
		for (Integer integer : diamondList) {
			if (integer > 10) {
				System.out.print(trumpMap.get(integer) + "　");
			} else
				System.out.print(integer + "　");
		}
		System.out.println();
		System.out.print("クラブ\t：");
		for (Integer integer : clubList) {
			if (integer > 10) {
				System.out.print(trumpMap.get(integer) + "　");
			} else
				System.out.print(integer + "　");
		}
		System.out.println();
		System.out.println("------------------------");
		System.out.println("勝利点　あなた：" + playerWin + "　相手：" + computerWin);
	}

	public void handleCheckResult(Play play, String computerTrump, String playerTrump) {
		System.out.println("相手の表示札：" + play.handleRedefinitionTrump(computerTrump));
		System.out.println("あなたの手札：" + play.handleRedefinitionTrump(playerTrump) );
		if (getTrumpNumber(computerTrump) == getTrumpNumber(playerTrump))
			System.out.println("引き分けです。");
		else if (getTrumpNumber(playerTrump) > getTrumpNumber(computerTrump)) {
			System.out.println("あなたの勝ちです");
			playerWin++;
		} else {
			System.out.println("あなたの負けです。");
			computerWin++;
		}
	}

	public void handlePrintResultAfterOver() {
		if (playerWin > computerWin)
			System.out.println("あなたの勝ちです！");
		else if (computerWin > playerWin)
			System.out.println("相手の勝ちです");
		else
			System.out.println("引き分けです。");
		System.out.println();
	}

}
