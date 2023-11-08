package DSA;

import java.util.Scanner;

public class Identity_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int row1,row2,col1,col2,count=0;
		Scanner s = new Scanner(System.in);
		System.out.print("enter the row1: ");
		row1=s.nextInt();
		System.out.print("enter the col1: ");
		col1=s.nextInt();
		System.out.print("enter the row2: ");
		row2=s.nextInt();
		System.out.print("enter the col2: ");
		col2=s.nextInt();
		if(row1==row2 && col1==col2) {
		int a[][]=new int[row1][col1];
		int b[][]=new int[row2][col2];
		System.out.println("enter the A matrix elements: ");
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col1;j++)
				a[i][j]=s.nextInt();
		}
		System.out.println("enter the b matrix values: ");
		for(int i=0;i<row2;i++) {
			for(int j=0;j<col2;j++)
				b[i][j]=s.nextInt();
			}
		for(int i=0;i<row1;i++) {
			for(int j=0;j<col2;j++) {
				if(a[i][j]!=b[i][j]) {
					count++;
					break;
				}
			}
		}
		if(count==0)
			System.out.println("both matrix are same");
		else
			System.out.println("both matrix are not same");
		}
		else
			System.out.println("rows and columns are not same");
		}
			
	}
	

