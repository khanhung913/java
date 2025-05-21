package lession20;

public class Sample2008 {
	public static void main(String[] args) {
		Phone2008 phone1 = new Phone2008();
		Phone2008 phone2 = new Phone2008();
		Phone2008 phone3 = phone1;

		boolean bl1 = phone1.equals(phone2);
		boolean bl2 = phone1.equals(phone3);
		System.out.println("iphone1とiphone2が同じオブジェクトか調べた結果：" + bl1);
		System.out.println("iphone1とiphone3が同じオブジェクトか調べた結果：" + bl2);
	}
}
