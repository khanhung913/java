package jp.co.exercise.jp;

public class IndianPoker {

	public static void main(String[] args) {
		Play play = new Play();
		Logic logic = new Logic();
		int gameNumbers = 3;
		System.out.println("【ゲーム　スタート】");
		for (int i = 1; i <= gameNumbers; i++) {
			System.out.println("★" + i + "回戦");
			System.out.println("山札から一枚引きます");
			//コンピュータの札を引く処理
			String computerTrump = play.handleTakeTrump(logic);
			String definatedComputerTrump = play.handleRedefinitionTrump(computerTrump);
			System.out.println("相手の表示札：" + definatedComputerTrump);
			System.out.println();
			//プレイヤーの札を引く処理
			String playerTrump = play.handleTakeTrump(logic);
			playerTrump = play.handleProcessPlayerChoice(playerTrump, logic);
			System.out.println(">>>>>>>  勝負！  <<<<<<<<<");
			logic.handleCheckResult(play, computerTrump, playerTrump);
			System.out.println();
			System.out.println("----------捨札----------");
			logic.handlePrintUsedTrump(play.getTrumpMap());
			System.out.println("************************************");
		}
		System.out.println();
		System.out.println("【最終結果】");
		logic.handlePrintResultAfterOver();
		System.out.println("【ゲーム終了】");
	}
}
