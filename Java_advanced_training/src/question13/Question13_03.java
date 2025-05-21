package question13;

public class Question13_03 {
	public static void main(String[] args) {
		String text="カエルがゲコゲコとゲコ池で鳴いている。";
		System.out.println(text);
		System.out.println("ゲコという文字は先頭から"+(text.indexOf("ゲコ")+1)+"番目です");
	}
}
