package lession16;

public class Human1601 {
	private String name;
	private int age;

	public void setProfile(String name) {
		this.name = name;
		System.out.println("名前を" + this.name + "にしました。");
	}

	public void setProfile(int age) {
		this.age = age;
		System.out.println("年齢を" + this.age + "歳にしました。");
	}

	public void setProfile(String name, int age) {
		this.name = name;
		this.age = age;
		System.out.println("名前を" + this.name + "に、年齢を" + this.age + "歳にしました。");
	}
}
