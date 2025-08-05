/*

Problem Name:
Rotate a Matrix 90 Degrees Anti-Clockwise
 
Problem Statement:

You are given a 2D matrix of dimensions r x c. 
Write a Java program to rotate the matrix 90 degrees in the anti-clockwise direction.

You are required to do this using a two-step approach:

Transpose the original matrix.
Reverse the columns of the transposed matrix to achieve anti-clockwise rotation.
 
*/

package arrays;
import java.util.Scanner;
public class AntiClockwiseRotateMatrix {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of rows:");
		int r=sc.nextInt();
		System.out.println("Enter the number of columns:");
		int c=sc.nextInt();
		
		int[][] a=new int[r][c];
		System.out.println("Enter the matrix elements:");
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
		
		// Reverse each columns of the transposed matrix to get anti-clockwise rotation

		System.out.println("Matrix after 90° anti-clockwise rotation:");
		for(int i=c-1;i>=0;i--) {
			for(int j=0;j<r;j++) {
				System.out.print(transposed[i][j]+" ");
			}
			System.out.println();
		}
		
		sc.close();
	}

}
