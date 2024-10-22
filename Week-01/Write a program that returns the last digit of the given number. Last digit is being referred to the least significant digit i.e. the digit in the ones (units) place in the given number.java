import java.util.Scanner;

class prog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        System.out.println(Math.abs(n%10));
    }
}
