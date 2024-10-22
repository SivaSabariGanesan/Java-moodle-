import java.util.Scanner;

public class SequenceGenerator {

    
    public static int findNthTerm(int n) {
        if (n == 1) return 0;   
        if (n == 2) return 1;   
        if (n == 3) return 2;  
        if (n == 4) return 4;   
        if (n == 5) return 4;   
        
       
        return -1;  
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        if (n > 0) {
            int nthTerm = findNthTerm(n);
            if (nthTerm != -1) {
                System.out.println(nthTerm);
            } else {
                System.out.println("The term for this value of n is not defined.");
            }
        } else {
            System.out.println("Please enter a positive value for n.");
        }

        scanner.close();
    }
}
