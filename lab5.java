import java.util.Scanner;
public class lab5 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("What do you want to do?");
		System.out.println("1 = Count from 1 to 10");
		System.out.println("2 = Show the odds from 1 to 100");
		System.out.println("3 = Find the sum of all the numbers from 1 to 100");
		System.out.println("4 = Find the sum of all the numbers from 1 to a number you choos");
		int userChoce = input.nextInt();
		System.out.println("------------------");
		if (userChoce == 1 ){
		for (int i = 1; i <= 10; i++)
			System.out.println(i);
		}
		if (userChoce == 2 ){
			for (int i = 1; i <= 100; i++){
				if (i%2 != 0){
					System.out.println(i);
				}
			}
		}
		if (userChoce == 3 ){
			int sum = 0;
			for (int i = 1; i <= 100; i++){
				sum = sum + i ;
			}
			System.out.println(sum);
		}
		
		if (userChoce == 4 ){
			int sum = 0;
			System.out.println("Choos a number");
			int userNum = input.nextInt();
			for (int i = 1; i <= userNum; i++){
				sum = sum + i;
			}
			System.out.println(sum);
		}
	}
}
