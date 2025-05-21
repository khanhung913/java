package lession20;

public class Phone2006 {
	protected int fee;
	protected double data;

	public Phone2006() {
		fee = 5000;
		data = 2.0;
	}

	public void show() {
		System.out.println("携帯電話の料金は、" + fee + "円です。");
		System.out.println("データ通信量は、" + data + "GBです。");
	}
}
