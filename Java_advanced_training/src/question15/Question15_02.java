package question15;

import java.util.Arrays;
import java.util.List;

public class Question15_02 {

	public static void main(String[] args) {
		Test test1 = new Test();
		Test test2 = new Test();
		System.out.println("1つ目のハッシュコードは" + test1);
		System.out.println("2つ目のハッシュコードは" + test2);
		List<Integer> list = Arrays.asList(1,2,3,4,5,6,7);
		list.stream().filter(i->i<5).forEach(i->System.out.println(i));	
	}

}
