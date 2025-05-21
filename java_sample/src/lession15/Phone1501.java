package lession15;

public class Phone1501 {
	private int fee;
	private double data;

	public void setFee(int f) {
		if (f >= 0) {
			fee = f;
			System.out.println("料金を" + fee + "円にしました。");
		} else {
			System.out.println(f + "は正しい値ではありません。");
		}
	}

	public void setData(double d) {
		if (d >= 0 && d <= 99.99) {
			data = d;
			System.out.println("データ通信量を" + data + "GBにしました。");
		} else
			System.out.println(d + "は正しい値ではありません。");
	}
}
