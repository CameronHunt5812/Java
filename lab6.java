import java.util.Scanner;
import java.util.Random;

public class lab6 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in); 
		Random rand = new Random();
		int score = 0;
		for ( int i = 0; i < 5; i++){
			int num1 = rand.nextInt(999);
			int num2 = rand.nextInt(999);
			int ancer = num1 + num2;
			System.out.println("What is " + num1 + " + " + num2 + "?");
			int userAncer = input.nextInt();
			if (userAncer == ancer){
				System.out.println("Correct");
				score ++;
			}
			else {
				System.out.println("Rong. The corect ancer is, " + ancer);
			}
		}
		System.out.println("Your score is " + score + " out of 5");
	}
}
