Q2) Can you write a program that takes an integer array as input and performs the following operations: 

1. Find the maximum number in the array.
2. Subtract the maximum number from each element of the array.
3. Multiply the maximum number by each element of the resultant array.

Finally, return the resultant array. For example, for input {1, 5, 6, 9}, the output should be {-72, -36, -27, 0}.

Answer:
import java.util.Scanner;

public class prog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)  arr[i] = sc.nextInt();
        
        int max = 0;
        
        for(int i = 0; i < n; i++) {
            if(arr[i] > max)    max = arr[i];
        }
        
        for(int i = 0; i < n; i++) {
            arr[i] = (arr[i] - max) * max;
        }
        
        for(int i = 0; i < n; i++)  System.out.print(arr[i] + " ");
    }
}
