import java.util.Scanner;

public class _164 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int st[][] = new int[4][3];
		
		int sum[] = new int[4];
		
		for(int i=0; i<st.length; i++) {
			System.out.print(String.format("%dclass? ", i+1));
			for(int j=0; j<st[i].length; j++) {
				st[i][j] = sc.nextInt();
				sum[i] += st[i][j];
			}
		}
		
		for(int i=0; i<sum.length; i++) {
			System.out.println(String.format("%dclass : %d", i+1, sum[i]));
		}
	}
}
