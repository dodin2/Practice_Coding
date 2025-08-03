import java.util.Scanner;

public class _165 {

	public static void main(String[] args) {
		
		int arr[][] = new int[5][5];
		arr[0][0] = arr[0][2] = arr[0][4] = 1;
		
		Scanner sc = new Scanner(System.in);
		
		// 위행의 왼쪽과 오른쪽 값 구하는 식
		// arr[i-1][j-1] + arr[i-1][j+1] 단, 두 번째 행 부터니까 i=1부터 진행, j도 
		// arr[1,2,3,4][0]와, arr[1,2,3,4][4] 계산 따로 
		
		for(int i=1; i<arr.length; i++) { // 가운데 계산
			for(int j=1; j<arr[i].length-1; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
			}
		}
		
		for(int i=1; i<arr.length; i++) { // 1,2,3,4 니까 4개니까 
			arr[i][0] = arr[i-1][1];
			// arr[1][0] = arr[0][1]
			// arr[2][0] = arr[1][1]
			// arr[3][0] = arr[2][1]
			// arr[4][0] = arr[3][1]
		}
		
		for(int i=1; i<arr.length; i++) { // 
			arr[i][4] = arr[i-1][3];
			// arr[1][4] = arr[0][3]
		}
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
