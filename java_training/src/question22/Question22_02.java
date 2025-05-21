package question22;

public class Question22_02 {

	public static void main(String[] args) {
		Frog f1 = new Frog();
		Frog f2 = new Frog();
//		f1 = f2;

		if (f1.equals(f2))
			System.out.println("変数frog1と変数frog2は同じものです");
		else
			System.out.println("変数frog1と変数frog2は違うものです");

	}

}
