package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain03 {

	public static void main(String[] args) throws IOException {

		Student studentA = new Student();

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		System.out.println("studentAの名前を入力してください。");
		String name = reader.readLine();
		//Student.setName

		System.out.println("studentAの年齢を入力してください。");
		String name1 = reader.readLine();
		int age = Integer.parseInt(name1);
		//Student.setAge

	}

}
