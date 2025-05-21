package question07.sub2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import question01.Member01;
import question07.sub1.Car;

public class SystemMain07A {

	public static void main(String[] args) throws IOException {
		Car carA = new Car();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("名前を入力してください。");
		String name = br.readLine();
		Member01 memberA = new Member01();
		memberA.newName = name;
		System.out.println("あなたの名前は" + memberA.newName + "です。");
	}

}
