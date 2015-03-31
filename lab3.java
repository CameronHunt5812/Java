import java.util.Scanner;
public class lab3 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		System.out.println("What Kind of Math puestion do you want?");
		System.out.println("1 - add");
		System.out.println("2 - subtract");
		System.out.println("3 - divide");
		System.out.println("4 - multiply");
		int WhatQuest = input.nextInt();
		if (WhatQuest == 1){
			System.out.println("What is 8+3");
			int ancer1 = input.nextInt();
			if ( ancer1 == 11)
				System.out.println("Corect");
			if ( ancer1 < 11)
				System.out.println("To low");
			if ( ancer1 > 11)
				System.out.println("To high");
		}
		if (WhatQuest == 2){
			System.out.println("What is 8-3");
			int ancer2 = input.nextInt();
			if ( ancer2 == 5)
				System.out.println("Corect");
			if ( ancer2 < 5)
				System.out.println("To low");
			if ( ancer2 > 5)
				System.out.println("To high");
		}
		if (WhatQuest == 3){
			System.out.println("what is 8/4");
			int ancer3 = input.nextInt();
			if ( ancer3 == 2)
				System.out.println("Corect");
			if ( ancer3 < 2)
				System.out.println("To low");
			if ( ancer3 > 2)
				System.out.println("To high");
		}
		if (WhatQuest == 4){
			System.out.println("what is 4*3");
			int ancer4 = input.nextInt();
			if ( ancer4 == 12)
				System.out.println("Corect");
			if ( ancer4 < 12)
				System.out.println("To low");
			if ( ancer4 > 12)
				System.out.println("To high");
		}
	
	}
}
