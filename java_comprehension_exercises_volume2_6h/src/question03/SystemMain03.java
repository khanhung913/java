package question03;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain03 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		//(2)
		Student studentA = new Student();
		System.out.println("studentAの名前を入力してください。");
		String name = br.readLine();
		studentA.setName(name);
		System.out.println("studentAの年齢を入力してください。");
		String tempAge = br.readLine();
		int age = Integer.parseInt(tempAge);
		studentA.setAge(age);

		//(3)
		Student studentB = new Student("山田", 25);

		//(4)
		System.out.println("studentAの名前は" + studentA.getName() + "、年齢は" + studentA.getAge() + "歳です。");
		System.out.println("studentBの名前は" + studentB.getName() + "、年齢は" + studentB.getAge() + "歳です。");
		System.out.println("Studentクラスで生成したオブジェクトの数は" + Student.totalStudent + "です。");

		//(5)
		Teacher teacherA = new Teacher();
		System.out.println("teacherAの名前を入力してください。");
		String teacherName = br.readLine();
		System.out.println("teacherAの年齢を入力してください。");
		String tempTeacherAge = br.readLine();
		int teacherAge = Integer.parseInt(tempTeacherAge);
		System.out.println("teacherAの住所を入力してください。");
		String teacherAdress = br.readLine();
		teacherA.setTeacherInfo(teacherName, teacherAge, teacherAdress);
		System.out.println("teacherAの住所は" + teacherA.getAddress() + "です。");
	}

}
