/*
 
Problem Statement:
You are given a 2D matrix of dimensions r × c. Write a Java program to rotate the matrix by 90 degrees clockwise. 
Your solution should involve transpose and row reversal, not brute force copying to a new rotated matrix manually.

Input:

First line: number of rows r
Second line: number of columns c
Next r × c elements: matrix values

Output:

Print the matrix after 90° clockwise rotation. 
 */
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
		
		//Reverse each row of transposed matrix to get clockwise rotation
		System.out.println("Matrix after 90 degree clockwise rotation:");
		System.out.println();
		
		for(int i=0;i<c;i++) {
			for(int j=r-1;j>=0;j--) {
				System.out.print(transposed[i][j]+" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
