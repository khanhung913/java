package lession14;

public class Phone1402 {
	int fee;
	double data;

	public void show() {
		message();
		System.out.println("携帯電話の料金は" + fee + "円です。");
		System.out.println("データ通信量は" + data + "GBです。");
	}
	public void message() {
		System.out.println("これから携帯電話の情報を表示します。");
	}
}
