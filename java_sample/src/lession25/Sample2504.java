package lession25;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sample2504 {

	public static void main(String[] args) {
		start();
	}

	public static void start() {
		try {
			inputName();
		} catch (IOException | ArrayIndexOutOfBoundsException e) {
			e.printStackTrace();
			System.out.println("例外が発生しました。はじめからやり直してください。");
		}
	}

	public static void inputName() throws IOException, ArrayIndexOutOfBoundsException {
		String[] name = new String[2];
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("一人目の名前を入力してください");
		name[0] = br.readLine();
		System.out.println("二人目の名前を入力してください");
		name[1] = br.readLine();

		System.out.println("一人目の名前は" + name[0] + "さんです。");
		System.out.println("二人目の名前は" + name[1] + "さんです。");
		System.out.println("三人目の名前は" + name[2] + "さんです。");

	}

}
