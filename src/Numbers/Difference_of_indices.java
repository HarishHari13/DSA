package Numbers;

import java.util.Scanner;

public class Difference_of_indices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner s = new Scanner(System.in);
int n = s.nextInt();
int[] arr = new int[n];

for (int i = 0; i < n; i++) {
    arr[i] = s.nextInt();
}

int minIndex = 0;
int maxIndex = 0;

for (int i = 0; i < n; i++) {
    if (arr[i] < arr[minIndex]) {
        minIndex = i;
    }
    if (arr[i] > arr[maxIndex]) {
        maxIndex = i;
    }
}

int indexDifference = maxIndex - minIndex;
System.out.println(indexDifference);

s.close();
}
}
	


