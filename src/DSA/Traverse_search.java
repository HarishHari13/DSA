package DSA;

import java.util.Scanner;

public class Traverse_search {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n = s.nextInt();
		int arr[]=new int[n];
		System.out.print("Enter array elements one by one:");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.print("enter the elements you want to search:");
		int search=s.nextInt();
		int count=0;
		for(int i=0;i<n;i++) {
			if(arr[i]==search) {
				count++;
			System.out.printf("element %d found at position: %d\n",search,i+1);
	}
	}
if(count==0)
	System.out.println("search element is not present");
s.close();
}}