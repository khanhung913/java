package question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SystemMain04 {

	public static void main(String[] args) throws IOException {
		int[] ageGroup1= new int[5];
		ageGroup1[0]=22;
		ageGroup1[1]=18;
		ageGroup1[2]=24;
		ageGroup1[3]=19;
		ageGroup1[4]=20;
		
		System.out.println("配列ageDroup1で3番目の人の新しい年齢を入力してください");
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
		String tempratyAge= br.readLine();
		int age=Integer.parseInt(tempratyAge);
		ageGroup1[2]=age;
		System.out.println("配列ageGroup1で3番目の人の年齢は"+ageGroup1[2]+"歳です。");
		int[] ageGroup2= {23,33,26,21,25,22};
		System.out.println("配列ageGroup2での4番目の人の年齢は"+ageGroup2[3]+"歳です。");
		ageGroup2[3]=ageGroup1[3];
		System.out.println("配列ageGroup2での4番目の人の年齢は"+ageGroup2[3]+"歳です。");
		
		System.out.println("配列ageGroup1の要素数は"+ageGroup1.length+"人です。");
		System.out.println("配列ageGroup2の要素数は"+ageGroup2.length+"人です。");

	}

}
