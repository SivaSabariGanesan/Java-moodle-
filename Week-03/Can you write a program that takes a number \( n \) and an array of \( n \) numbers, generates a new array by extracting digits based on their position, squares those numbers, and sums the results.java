import java.util.Scanner;

class prog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        int arr[] = new int[n];
        
        int n1 = 0, n2 = 0, n3 = 0, n4 = 0, n5 = 0; 
        
        for(int i = 0; i < n; i++)  arr[i] = sc.nextInt();
        
        for(int i = 0; i < n; i++) {
            if(i == 0) {
                n1 = arr[i] * arr[i];
            }
            else if(i == 1) {
                if(arr[i] >= 10) n2 = (arr[i]/10) * (arr[i]/10);
            }
            else if(i == 2) {
                if(arr[i] >= 100) {
                    n3 = (arr[i] / 100) * (arr[i] / 100);
                }
            }
            else if(i == 3) {
                if(arr[i] >= 1000) {
                    n4 = (arr[i] / 1000) * (arr[i] / 1000);
                }
            }
            else if(i == 4) {
                if(arr[i] >= 10000) {
                    n5 = (arr[i] / 10000) * (arr[i] / 10000);
                }
            }
        }
        
        System.out.println(n1 + n2 + n3 + n4 + n5);
    }
}
