package lession20;

public class Phone2004 {
	protected double data;

	public void setData(double data) {
		this.data = data;
	}

	public void checkData() {
		System.out.println("データ通信量は" + data + "GBです。");
	}
}
