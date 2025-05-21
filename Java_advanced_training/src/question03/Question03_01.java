package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Question03_01 {

	public static void main(String[] args) throws IOException {
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		String str= bf.readLine();
		double size = Double.parseDouble(str);
		
		System.out.println("サイズが"+size+"の靴を購入します");
				

	}

}
