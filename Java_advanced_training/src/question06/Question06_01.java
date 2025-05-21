package question06;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question06_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int num= Integer.parseInt(str);
		String text=(num==1)? "1":"1以外";
		System.out.println(text+"が入力されました。");

	}

}
