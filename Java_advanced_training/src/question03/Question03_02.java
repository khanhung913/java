package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_02 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String s1=bf.readLine();
		String s2=bf.readLine();
		String s3=bf.readLine();

		System.out.println(s1+s2+s3);
	}

}
