import java.util.Scanner;

public class MoviePrediction {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int actingPower = scanner.nextInt();

        int criticsRating = scanner.nextInt();

      
        if (actingPower < 2 || criticsRating < 2) {
            System.out.println("No");  
        } else if (actingPower > 8 || criticsRating > 8) {
            System.out.println("Yes"); 
        } else {
            System.out.println("Maybe"); 
        }

        scanner.close();
        
    }
}
