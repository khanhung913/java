package lession20;

public class SmartPhone2005 extends Phone2005 {
	private int inch;

	public SmartPhone2005() {
		System.out.println("スマートフォンを作成しました。");
		inch = 5;
	}

	@Override
	public void show() {
		System.out.println("画面のサイズは" + inch + "インチです。");
	}
}