package lession20;

public class Sample2009 {

	public static void main(String[] args) {
		String str1 = "test";
		StringBuilder stringBuilder = new StringBuilder(str1);
		String str2 = stringBuilder.toString();
		System.out.println("str1:" + str1);
		System.out.println("str2:" + str2);
		System.out.println("==での比較結果：" + (str1 == str2));
		System.out.println("equals()での比較結果：" + str1.equals(str2));

	}

}
