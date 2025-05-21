package lession25;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Sample2505 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("好きな単語を入力してください");
		
		String input = br.readLine();
		
		WordChecker2505.checkNGWord(input);

	}

}
