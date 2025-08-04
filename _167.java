import java.util.Scanner;

public class _167 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[4][2];
		int avg[][] = new int[3][4];
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i=0; i<4; i++) {
			avg[0][i] = (arr[i][0]+arr[i][1])/2;
		}
		
		for(int i=0; i<2; i++) {
			avg[1][i] = (arr[0][i]+arr[1][i]+arr[2][i]+arr[3][i])/4;
		}
		
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				sum += arr[i][j];
			}
		}
		avg[2][0] = sum/arr.length*arr[0].length;
		
		for(int i=0; i<avg.length; i++) {
			for(int j=0; j<avg[i].length; j++) {
				System.out.print(avg[i][j]+ " ");
			}
			System.out.println();
		}
				//가로평균
				//avg[0][0] = arr[0][0]+arr[0][1] /2
				//avg[0][1] = arr[1][0]+arr[1][1]
				//avg[0][2] = arr[2][0]+arr[2][1]
				//avg[0][i] = arr[i][0]+arr[i][1]/2
				
				//세로평균
				//avg[1][0] = arr[0][0]+arr[1][0]+arr[2][0]+arr[3][0]/4
	}

}
