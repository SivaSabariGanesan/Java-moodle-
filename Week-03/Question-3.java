Q3) Can you write a program that takes an integer array as input and returns the sum of the longest sequence of positive numbers (considering 0 as positive)? If there are no positive numbers, return -1. 
If there are multiple longest sequences, sum all their positive numbers. For example, for input {-58, 32, 26, 92, -10, -4, 12, 0, 12, -2, 4, 32, -9, -7, 78, -79}, the output should be 174.

Answer:
import java.util.Scanner;

class prog {
    static int longestSum(int a[], int n) {
        int cursum = 0, c = 0, maxno = 0, maxsum = 0, f = 1;
        
        for(int i = 0; i < n; i++) {
            if(a[i] >= 0) {
                cursum += a[i];
                f = 0;
                c++;
            }
            else {
                if(c > maxno) {
                    maxsum = cursum;
                    maxno = c;
                }
                else if(c == maxno) {
                    maxsum += cursum;
                }
                cursum = 0;
                c = 0;
            }
        }
        maxsum = c > maxno ? cursum : maxsum;
        maxsum = c == maxno ? cursum + maxsum : maxsum;
        
        if(f == 1)  return -1;
        
        return maxsum;
    }
    
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        for(int i = 0; i < n; i++)  arr[i] = sc.nextInt();
        
        int sum = 0;
        
        System.out.println(longestSum(arr, n));
    }
}
