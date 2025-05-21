package question09;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question09_05 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("1か2を入力してください");
		String str1= bf.readLine();
		int num1= Integer.parseInt(str1);
		System.out.println("もう一度1か2を入力してください");
		String str2= bf.readLine();
		int num2= Integer.parseInt(str2);
		
		if(num1==1&&num2==1) {
			System.out.println("1が2回入力されました");
		}
	}

}
