package lession07;

public class Sample0705 {

	public static void main(String[] args) {
		int[][] score = { { 98, 66, 79 }, { 78, 34, 65 } };

		System.out.println("試験を受けた人数は" + score.length + "人です。");
		System.out.println("1人目が受けた試験の数は" + score[0].length + "種類です。");
		System.out.println("2人目が受けた試験の数は" + score[1].length + "種類です。");

		System.out.println("1人目が受けた1つ目の試験の点数は" + score[0][0] + "点です。");
		System.out.println("2人目が受けた2つ目の試験の点数は" + score[1][1] + "点です。");
		/*for (int i = 0; i < score.length; i++) {
			for(int k =0;k<score[0].length;k++) {
				System.out.print(score[i][k]+" ");
			}
			System.out.println();
		}*/
	}

}
