package DSA;

import java.util.Scanner;

public class Two_rotation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("Enter the number of elements:");
		int n = s.nextInt(),rot,x;
		int arr[]=new int[n];
		System.out.print("Enter array elements one by one:");
		for(int i=0;i<n;i++)
			arr[i]=s.nextInt();
		System.out.print("enter the number of rotation:");
		rot=s.nextInt();
		for(int r=0;r<rot;r++) {
			x=arr[n-1];
			for(int i=n-1;i>0;i++)
				arr[0]=x;
		}
			System.out.println("rotated array");
			for(int i=0;i<n;i++)
				System.out.print(arr[i]+" ");
			s.close();
				
	}

}
