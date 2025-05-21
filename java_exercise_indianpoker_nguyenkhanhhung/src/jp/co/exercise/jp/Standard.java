package jp.co.exercise.jp;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Random;

public class Standard {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Random rd = new Random();
		String[] trumpType = { "スペード", "ハート", "ダイヤ", "クラブ" };
		String[] trumpTypeAlphabet = { "J", "Q", "K", "A" };
		String[] trumpList = new String[13];
		String[][] trash = new String[4][13];
		for (int i = 0; i < trash.length; i++) {
			for (int j = 0; j < trash[i].length; j++) {
				trash[i][j] = "";
			}
		}

		for (int j = 0; j < 9; j++) {
			trumpList[j] = Integer.toString(j + 2);
		}
		for (int j = 10; j < 14; j++) {
			String temp = Integer.toString(j);
			String str = temp.substring(1);
			int num = Integer.parseInt(str);
			trumpList[j - 1] = trumpTypeAlphabet[num];

		}

		for (int j = 0; j < trumpList.length; j++) {
			System.out.print(trumpList[j] + " ");
		}

		for (int k = 0; k < 10; k++) {
			//Game Start
			System.out.println("Game Start");
			int comTrumpTypeRand;
			int comTrumpNumberRand;
			int userTrumpTypeRand;
			int userTrumpNumberRand;
			boolean check = false;
			do {
				comTrumpTypeRand = rd.nextInt(4);
				comTrumpNumberRand = rd.nextInt(13);
				if (trash[comTrumpTypeRand][comTrumpNumberRand].equals("")) {
					check = true;
				}
			} while (!check);
			check = false;
			do {
				userTrumpTypeRand = rd.nextInt(4);
				userTrumpNumberRand = rd.nextInt(13);
				if (trash[userTrumpTypeRand][userTrumpNumberRand].equals("")) {
					check = true;
				}
			} while (!check);
			String computerTrump = trumpType[comTrumpTypeRand] + " "
					+ trumpList[comTrumpNumberRand];
			trash[comTrumpTypeRand][comTrumpNumberRand] = trumpList[comTrumpNumberRand];
			System.out.println(computerTrump);
			String userTrump = trumpType[userTrumpTypeRand] + " "
					+ trumpList[userTrumpNumberRand];
			trash[userTrumpTypeRand][userTrumpNumberRand] = trumpList[userTrumpNumberRand];
			System.out.println(userTrump);
			for (int i = 0; i < trash.length; i++) {
				System.out.print(trumpType[i] + ((i == 0) ? ":" : "\t:"));

				for (int j = 0; j < trash[i].length; j++) {
					if (!trash[i][j].equals("")) {
						System.out.print("\t" + trash[i][j]);
					}
				}
				System.out.println();
			}
		}
	}

}
