package exercise;

public class IndianPoker {

	public static void main(String[] args) {
		int[][] trumpList = new int[4][13];
		for (int i = 0; i < trumpList.length; i++) {
			for (int j = 0; j < trumpList[i].length; j++) {
				trumpList[i][j] = j + 2;
			}
		}
		for (int i = 0; i < trumpList.length; i++) {
			for (int j = 0; j < trumpList[i].length; j++) {
				System.out.print(trumpList[i][j]+" ");
			}
			System.out.println();
		}
	}

}
