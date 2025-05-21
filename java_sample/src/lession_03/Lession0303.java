package lession_03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lession0303 {
	public static void main(String[] args) throws IOException {
		BufferedReader b = new BufferedReader(new InputStreamReader(System.in));
		String a = b.readLine();
		int c= Integer.parseInt(a);
		System.out.println(c);
	}

}
