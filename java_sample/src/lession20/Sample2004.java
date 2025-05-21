package lession20;

public class Sample2004 {
	public static void main(String[] args) {
		double data = 2.5;
		SmartPhone2004 sp = new SmartPhone2004();
		sp.setData(data);
		sp.checkData();
		System.out.println("データ通信量を変更します。");
		sp.doubleData();
		sp.checkData();
	}
}
