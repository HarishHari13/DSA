package Sorting;

import java.util.Scanner;

public class BubbleSort {
	static void bubbleSort(int n,int ar[]) {
		int t;
	for(int step=0;step<0;step++) {
		for(int i=0;i<n-1;i++) {
			if(ar[i]>ar[i+1]) {
				t=ar[i];
				ar[i]=ar[i+1];
				ar[i+1]=t;
			}
		}
	}}
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
	ar[i]
=s.nextInt();
	}
bubbleSort(n,ar);
printArray(n,ar);
s.close();
}
}