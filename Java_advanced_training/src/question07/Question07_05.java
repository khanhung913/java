package question07;

public class Question07_05 {

	public static void main(String[] args) {
		int n = 5;
		for (int i = 1; i <= n; ++i) {
			for (int j = 1; j <= n - i; ++j) {
				System.out.print("　");
			}
			for (int k = 1; k <= (i * 2 - 1); k++) {
				String block = (i % 2 == 0) ? "■" : "□";
				System.out.print(block);
			}
			System.out.println();
		}
	}

}
