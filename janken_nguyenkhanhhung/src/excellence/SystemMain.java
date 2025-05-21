package excellence;

public class SystemMain {

	public static void main(String[] args) {
		System.out.println("【じゃんけん開始】");
		JankenJudge jankenJudge = new JankenJudge();
		Player player = new Player();
		System.out.println("じゃんけんの回数を入力してください");
		int jankenOfNumbers = player.choiceNumbersOfJanken();
		int jankenHistory[][] = new int[jankenOfNumbers][2];

		for (int i = 0; i < jankenOfNumbers; i++) {
			System.out.println("【" + (i + 1) + "回戦目】");
			System.out.println("プレイヤーの手を決めてください");
			System.out.println("(グー:0、チョキ:1、パー:2)");
			int playerHand = player.playerHandInput();
			int comHand = player.computerChoiceHand();
			jankenJudge.checkJanken(playerHand, comHand);
			jankenHistory[i][0] = playerHand;
			jankenHistory[i][1] = comHand;
		}
		System.out.println("【じゃんけん終了】");
		jankenJudge.checkAllResult();

	}
}
