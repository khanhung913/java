package question13;

public class Question13_04 {

	public static void main(String[] args) {
		String str1="ありがとう";
		System.out.println(str1);
		System.out.println("文字列の追加を行います");
		StringBuilder sb= new StringBuilder(str1);
		String str2="ございます";
		sb.append(str2);
		System.out.println(sb);

	}

}
