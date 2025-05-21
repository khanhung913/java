package lession08;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample0806 {

	public static void main(String[] args) throws IOException {
		System.out.println("整数を入力してください。");
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str = bf.readLine();
		int num =Integer.parseInt(str);
		switch(num) {
		case 4 : 
			System.out.println("4が入力されました。");
			break;
		case 7:
			System.out.println("7が入力されました。");
			break;
		default:
			System.out.println("4と7以外の数字が入力されました。");
			break;
		
		}

	}

}
