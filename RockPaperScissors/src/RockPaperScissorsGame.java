import java.util.Random;
import java.util.Scanner;

public class RockPaperScissorsGame {

	public static void main(String[] args) {

		int compScore = 0;
		int yourScore = 0;
		int counter = 0;

		Scanner scan = new Scanner(System.in);
		System.out.println("Welcome to rock, paper, scissors! First to 5 wins!");

		Random rand = new Random();

		while (counter == 0) {
			int comp = rand.nextInt(3);
			System.out.println("Enter rock, paper, or scissors");
			String input = scan.next();

			if (input.toLowerCase().equals("rock") && comp == 1) {
				compScore++;
				System.out.println("CPU: Paper");
			} 
			else if (input.toLowerCase().equals("rock") && comp == 2) {
				yourScore++;
				System.out.println("CPU: Scissors");
			} 
			else if (input.toLowerCase().equals("paper") && comp == 0) {
				yourScore++;
				System.out.println("CPU: Rock");
			} 
			else if (input.toLowerCase().equals("paper") && comp == 2) {
				compScore++;
				System.out.println("CPU: Scissors");
			} 
			else if (input.toLowerCase().equals("scissors") && comp == 0) {
				compScore++;
				System.out.println("CPU: Rock");
			} 
			else if (input.toLowerCase().equals("scissors") && comp == 1) {
				yourScore++;
				System.out.println("CPU: Paper");
			} 
			else if (input.toLowerCase().equals("rock") && comp == 0) {
				System.out.println("CPU: Rock");
			} 
			else if (input.toLowerCase().equals("paper") && comp == 1) {
				System.out.println("CPU: Paper");
			} 
			else if (input.toLowerCase().equals("scissors") && comp == 2) {
				System.out.println("CPU: Scissors");
			}
			System.out.println("");
			System.out.println("You: " + yourScore);
			System.out.println("CPU: " + compScore);
			if (yourScore == 5) {
				System.out.println("");
				System.out.println("YOU WON!");
				return;
			}
			if (compScore == 5) {
				System.out.println("");
				System.out.println("You Lost");
				return;
			}
		}
	}

}
