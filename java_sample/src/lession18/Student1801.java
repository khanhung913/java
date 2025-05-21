package lession18;

public class Student1801 {
	public static int sum = 0;
	private int no;
	private String name;
	private String gender;
	private int age;

	public Student1801(int no, String name, String gender, int age) {
		this.no = no;
		this.name = name;
		this.gender = gender;
		this.age = age;
		
		sum++;
		
		System.out.println("学生を作成しました。");
	}
	public void show() {
		System.out.println("学生番号は"+no+"番です。");
		System.out.println("氏名は"+name+"です。");
		System.out.println("性別は"+gender+"です。");
		System.out.println("年齢は"+age+"歳です。");
	}

	public static void showSum() {
		System.out.println("学生は合計"+sum+"人です。");
	}
}
