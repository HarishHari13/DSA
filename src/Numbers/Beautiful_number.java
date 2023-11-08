package Numbers;

import java.util.Scanner;

public class Beautiful_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

   
        int n =s.nextInt();

     
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }

      
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }

        
        if (sum % 2 == 0 && sum % 3 == 0 && sum % 5 == 0) {
            System.out.println("Beautiful Array");
        } else {
            System.out.println("Not a Beautiful Array");
        }
    }

	}

