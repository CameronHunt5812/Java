import java.util.Scanner;
public class lab7 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int counter = 1;
		while (counter <= 10){
			System.out.println(counter);
			counter++;
		}
		int counterOne = 10;
		while (counterOne > 0){
			System.out.println(counterOne);
			counterOne--;
		}
		int num1 = input.nextInt();
		int temp = 0;
		while (num1 > 1){
			temp = num1 / 2;
			System.out.println( num1 + " / 2 = " + temp);
			num1 = temp;
		}
	}
}
