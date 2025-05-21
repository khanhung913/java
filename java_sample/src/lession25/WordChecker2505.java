package lession25;

public class WordChecker2505 {
 public static void checkNGWord(String input) throws Exception{
	 if("ITSchool".equals(input)) {
		 throw new Exception("入力された内容がNGワードです。");
	 }else
		 System.out.println("問題ありません");
	 
 }
}
