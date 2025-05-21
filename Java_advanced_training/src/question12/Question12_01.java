package question12;

public class Question12_01 {

	public static void main(String[] args) {
		Bank sampleTaro = new Bank(10000);
		Bank testHanako = new Bank(8000);

		sampleTaro.deposit(7000);
		testHanako.deposit(25000);

		System.out.println("全ての口座の合計金額：" + Bank.totalBalance);
		System.out.println("サンプル太郎さんの口座：" + sampleTaro.getBalance());
		System.out.println("テスト花子さんの口座：" + testHanako.getBalance());

	}

}
