package lession23;

public class Chef2301 extends Worker2301 {

	protected Chef2301(String name, int age) {
		super(Constant2301.CHEF, name, age);
	}

	public void doWork() {
		System.out.println("食事を作ります。");
	}

}
