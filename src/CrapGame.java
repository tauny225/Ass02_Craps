import java.util.Scanner;

public class CrapGame {

    public static void main(String[] args) {
        // write your code here
        Scanner input = new Scanner(System.in);
        String choice;
        Die die1 = new Die();
        Die die2 = new Die();
        int die1Value, die2Value, roll2 = 0;
        do {
            die1Value = die1.getRoll();
            die2Value = die2.getRoll();
            int points = die1Value + die2Value;
            System.out.println("\nYou rolled " + die1Value + "," + die2Value + " and sum is : " + points);
            if (points == 7 || points == 11) {
                System.out.println("\nYou Win !");
            } else if (points == 2 || points == 3 || points == 12)
            {
                System.out.println("\nYou Lose!");
            } else {
                roll2 = 0;
                while (roll2 != 7) {
                    die1Value = die1.getRoll();
                    die2Value = die2.getRoll();
                    roll2 = die1Value + die2Value;
                    System.out.println("\nYou rolled " + die1Value + "," + die2Value + " and sum is : " + roll2);
                    if (points == roll2) {
                        System.out.println("\nYou Win !");
                        break;
                    } else if (roll2 == 7) {
                        System.out.println("\nYou Lose !");
                    }
                }
            }
            System.out.println("Would you like to play again? [y/n]");
             choice = input.nextLine();
            }while (choice.equals("y") || choice.equals("Y"));
        }
}



