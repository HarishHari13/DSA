package Sorting;

import java.util.Scanner;

public class InsertionSort {
	static void insertionSort(int n,int ar[]) {
		int t,key;
		for(int step=1;step<n;step++) {
			key=step;
			for(int i=step-1;i<step;i++) {
				if(ar[i]>ar[key]){
					t=ar[1];
					ar[i+1]=ar[key];
					ar[key]=t;
					key--;
			}}}}

	
		// TODO Auto-generated method stub
		static void printArray(int n,int ar[]) {
			System.out.println("after sorting: ");
			for(int i=0;i<n;i++) {
				System.out.print(ar[i]+" ");
			}
		}
	public static void main(String[] args) {
			// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("enter the no of elements: ");
	int n = s.nextInt();
	int ar[]=new int[n];
	System.out.print("enter the array elements: ");
	for(int i=0;i<n;i++) {
		ar[i]=s.nextInt();
		}
	insertionSort(n,ar);
	printArray(n,ar);
	s.close();
	}
	}


