package Numbers;

import java.util.Scanner;

public class Arasu_series {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		
		System.out.print("enter number :");
		int n = s.nextInt();
		
		for(int i=1;i<=n;i++) {
			
			int f = i * i+1;
			System.out.print(f);
		}
		

}

}


