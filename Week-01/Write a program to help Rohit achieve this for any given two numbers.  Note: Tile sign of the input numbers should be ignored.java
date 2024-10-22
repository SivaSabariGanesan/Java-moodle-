import java.util.Scanner;

class prog {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        
        int n1 = Math.abs(num1 % 10);
        int n2 = Math.abs(num2 % 10);
        
        System.out.println(n1 + n2);
    }
}
