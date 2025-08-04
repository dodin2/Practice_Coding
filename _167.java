package array;

import java.util.Scanner;

public class _167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[4][2];
		int[] rowAvg = new int[4];
		int[] colAvg = new int[2];
		int totalSum = 0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<4; i++) {
			rowAvg[i] = (arr[i][0]+arr[i][1])/2;
		}
		
		for(int i=0; i<2; i++) {
			int sum=0;
			for(int j=0; j<4; j++) {
				sum+=arr[j][i];
				// (arr[0][0]+arr[1][0]+arr[2][0]+arr[3][0])/4
				// (arr[0][1]+arr[1][1]+arr[2][1]+arr[3][1])/4
			}
			colAvg[i]=sum/4;
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				totalSum += arr[i][j];
			}
		}
		int totalAvg = totalSum/(arr.length*arr[0].length);
		
		
		for(int i=0; i<rowAvg.length; i++) {
			System.out.print(rowAvg[i] + " ");
		}
		System.out.println();
		
		for(int i=0; i<colAvg.length; i++) {
			System.out.print(colAvg[i] + " ");
		}
		System.out.println();
		System.out.println(totalAvg);
		
				//가로평균
				//avg[0][0] = arr[0][0]+arr[0][1] /2
				//avg[0][1] = arr[1][0]+arr[1][1]
				//avg[0][2] = arr[2][0]+arr[2][1]
				//avg[0][i] = arr[i][0]+arr[i][1]/2
				
				//세로평균
				//avg[1][0] = arr[0][0]+arr[1][0]+arr[2][0]+arr[3][0]/4
	}

}
