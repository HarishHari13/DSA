package Numbers;

import java.util.Scanner;

public class GCD1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1,n2;
		Scanner s =new Scanner(System.in);
		s.useDelimiter("[\\s]+");
		n1=s.nextInt();
		n2=s.nextInt();
		int gcd=1;
		for(int i=1;i<=n1&&i<=n2;++i) {
			if(n1%i==0&&n2%i==0)
				gcd=i;
		}
		if(gcd==1) {
			System.out.println("-1");
		}
		else {
		System.out.println("GCD of"+n1+"and"+n2+"is"+gcd);
			}

		
	}
	

}
