package lession_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lession0304 {

	public static void main(String[] args) throws IOException {
		System.out.println("こんにちは！");
		System.out.println("よろしくお願いいたします。");
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String s = b.readLine();
		System.out.println(s+50);
		int h=2;
		int d=3;
		
		System.out.println((double)((double)d/(double)h));
		try {
	        Integer.parseInt(s);
	        int k = Integer.parseInt(s);
	        System.out.println(k+" is integer");
	    } catch (NumberFormatException e) {
	        System.out.println(s+" is not integer");
	    }
	}

}
