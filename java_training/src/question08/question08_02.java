package question08;

public class question08_02 {

	public static void main(String[] args) {
		int[] score = {88,62,54,76,45};
//		int sum=score[0]+score[1]+score[2]+score[3]+score[4];
		int sum=0;
		for(int i=0;i<score.length;i++) {
			sum+=score[i];
		}
		System.out.println("全員のテストの合計は"+sum+"点です。");
	}

}
