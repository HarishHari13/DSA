package DSA;

import java.util.Scanner;

public class Traverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
System.out.print("Enter the number of elements:");
int n = s.nextInt();
int arr[]=new int[n+1];
System.out.print("Enter asrray elements one by one:");
for(int i=0;i<n;i++)
	arr[i]=s.nextInt();
System.out.print("Enter the position you want to insert:");
int pos=s.nextInt();
System.out.print("Enter the elements you want to insert:");
int element=s.nextInt();
int j=n;
while(j>pos) {
	arr[j]=arr[j-1];
	j--;
}
arr[pos]=element;
System.out.println("Array traverse:");
for(int i=0;i<=n;i++)
	System.out.print(arr[i]+" ");
s.close();

		
	}

}
