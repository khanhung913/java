package lession08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0803 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader reader= new BufferedReader(new InputStreamReader(System.in));
		String str = reader.readLine();
		int res = Integer.parseInt(str);
		
		if(res>4) {
			if(res<=10) {
				System.out.println(res+"は4より大きく10以下の数字です。");
			}
		}
		System.out.println("システムを終了します。");
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 10; j++) {
				
			}
		}
	}

}
