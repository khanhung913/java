package lession06;

public class Sample0603 {

	public static void main(String[] args) {
		int num1=1;
		int num2=0;
		int num3=1;
		int num4=0;
		
		//後置インクリメントを使用
		num2=num1++;
		//前置インクリメントを使用
		num4=++num3;
		System.out.println("num2の値は"+num2+"です。");
		System.out.println("num4の値は"+num4+"です。");
		

	}

}
