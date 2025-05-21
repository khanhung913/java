package extra;

import java.util.Map;
import java.util.TreeMap;

public class SystemMain {

	public static void main(String[] args) {
		System.out.println("*******【じゃんけん開始】*******");
		JankenJudge jankenJudge = new JankenJudge();
		Player player = new Player();
		System.out.println("じゃんけんの回数を入力してください");
		int numberOfJanken = player.choiceNumbersOfJanken();
		System.out.println("対戦人数を選択してください");
		int numbersOfComputer = player.choiceNumbersOfComputer();
		int jankenHistory[][] = new int[numberOfJanken][numbersOfComputer + 1];
		Map<String, Integer> jankenMapList = new TreeMap<String, Integer>();

		for (int i = 0; i < numberOfJanken; i++) {
			jankenJudge.handleInput(player, jankenMapList, jankenHistory, i, numbersOfComputer);
			jankenJudge.checkJanken(jankenMapList, player, jankenHistory, i, numbersOfComputer);
		}
		System.out.println("*******【じゃんけん終了】*******");
		jankenJudge.historyOutput(jankenHistory, numberOfJanken, numbersOfComputer);
		jankenJudge.checkAllResult();

	}
}
