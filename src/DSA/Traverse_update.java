package DSA;

import java.util.Scanner;

public class Traverse_update {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter asrray elements one by one:");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.print("Enter the position you want to update:");
		int pos=s.nextInt();
		System.out.print("enter the elements you want to update:");
		int element=s.nextInt();
		arr[pos-1]=element;
		System.out.println("Array traverse:");
		for(int i=0;i<n;i++)
			System.out.print(arr[i]+" ");
		s.close();
	}

}
