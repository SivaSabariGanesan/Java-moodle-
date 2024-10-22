import java.util.*;
public class SequencePattern {

    public static String generatePattern(int n) {
        if (n == 1) {
            return "1";
        }

        
        String previousPattern = generatePattern(n - 1);
        return previousPattern + " " + n + " " + previousPattern;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int input=sc.nextInt();

        
        String result = generatePattern(input);
        System.out.println(result);
    }
}
