package lession17;

public class Dog1703 {
	private String gender;
	private String breed;
	
	public Dog1703() {
		gender="オス";
		System.out.println("引数なしのコンストラクタで犬を作成しました。");
	}
	public Dog1703(String breed) {
		this();
		this.breed=breed;
		System.out.println("引数ありのコンストラクタで犬を作成しました。");
	}
	public void show() {
		System.out.println("性別は"+gender+"です。");
		System.out.println("犬種は"+breed+"です。");
	}
}
