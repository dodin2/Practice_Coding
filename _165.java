package array;

public class _165 {

	public static void main(String[] args) {
		
		int arr[][] = new int[5][7];
		arr[0][1] = arr[0][3] = arr[0][5] = 1;
		
		// 위행의 왼쪽과 오른쪽 값 구하는 식
		// arr[i-1][j-1] + arr[i-1][j+1]
		
		for(int i=1; i<arr.length; i++) { 
			for(int j=1; j<arr[i].length-1; j++) {
				arr[i][j] = arr[i-1][j-1] + arr[i-1][j+1];
			}
		}
		
		for(int i=0; i<arr.length; i++) {
			for(int j=1; j<arr[i].length-1; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
