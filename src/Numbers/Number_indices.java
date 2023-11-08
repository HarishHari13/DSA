package Numbers;

import java.util.Scanner;

public class Number_indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub  
		        Scanner s = new Scanner(System.in);
                System.out.print("Enter the number of elements (N): ");
		        int N = s.nextInt();

		        if (N <= 0 || N > 1000000) {
		            System.out.println("Invalid input. N should be between 1 and 1,000,000.");
		            return;
		        }

		        int[] numbers = new int[N];
		        for (int i = 0; i < N; i++) {
		            System.out.println("Enter element " + (i + 1) + ": ");
		            numbers[i] = s.nextInt();
		        }

		        int smallest = numbers[0];
		        int largest = numbers[0];
		        int smallestIndex = 1;
		        int largestIndex = 1;
		        for (int i = 1; i < N; i++) {
		            if (numbers[i] < smallest) {
		                smallest = numbers[i];
		                smallestIndex = i + 1; 
		            }
		            if (numbers[i] > largest) {
		                largest = numbers[i];
		                largestIndex = i + 1; 
		            }
		        }
		        System.out.println(+ smallest + " at index " + smallestIndex);
		        System.out.println(+ largest + " at index " + largestIndex);
		        s.close();
		    }
		}


