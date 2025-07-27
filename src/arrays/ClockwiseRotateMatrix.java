
package arrays;
import java.util.Scanner;
public class ClockwiseRotateMatrix {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int r= sc.nextInt();
		
		System.out.println("Enter the number of columns: ");
		int c= sc.nextInt();
		
		int[][] a=new int[r][c];
		System.out.println("Enter the matrix elements: ");
		System.out.println();
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				a[i][j]=sc.nextInt();
			}
		}
		//Convert it into Transpose Matrix 
		int[][] transposed=new int[c][r];
		for(int i=0;i<r;i++) {
			for(int j=0;j<c;j++) {
				transposed[j][i]=a[i][j];
			}
		}
		
		//Reverse the transposed matrix row to get clockwise rotation
		System.out.println("Matrix after 90 degree clockwise rotation:");
		System.out.println();
		
		for(int i=0;i<c;i++) {
			for(int j=r-1;j>=0;j--) {
				System.out.print(transposed[i][j]);
			}
			System.out.println();
		}
		sc.close();
	}
}
