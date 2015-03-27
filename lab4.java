import java.util.Scanner;

public class lab4 {
	public static void main (String args[]){
		Scanner input = new Scanner(System.in);
		int playerGold = 50;
		int tempGold = 0;
		
		int swordsInStock = 2;
		int swordCost = 50;
		
		int potionsInStock = 10;
		int potionCost = 5;
		
		int magicReagentsInStock = 2;
		int magicReagentCost = 3;
		
		int magicScrollsInStock = 4;
		int magicScroleCost = 25;
		
		int woodenShieldsInStock = 1;
		int woodenShieldCost = 35;

		System.out.println("Pick which you want");
		System.out.println("1 = Swords");
		System.out.println("2 = potions");
		System.out.println("3 = Magic Reagents");
		System.out.println("4 = Magic Scrolls");
		System.out.println("5 = Wooden Shields");

		int itemChoce = input.nextInt();

		if (itemChoce == 1){
			System.out.println("We have " + swordsInStock + " Swords, " + swordCost + " Gold each");
			System.out.println("How many do you want");
			int numberOfSwords = input.nextInt();
			tempGold = playerGold;
			tempGold -= swordCost * numberOfSwords;
			if (numberOfSwords <= swordsInStock && (tempGold >= 0)){
				swordsInStock -= numberOfSwords;
				playerGold = tempGold;
				System.out.println("You Have " + playerGold + " gold leaft.");
			}
			else if (numberOfSwords > swordsInStock){
				System.out.println("We dont have that many");
			}
			else {
				System.out.println("That is too expensive.");
			}
		}
		else if (itemChoce == 2){
			System.out.println("We have " + potionsInStock + " potions, " + potionCost + " Gold each");
			System.out.println("How many do you want");
			int numberOfPotions = input.nextInt();
			tempGold = playerGold;
			tempGold -= potionCost * numberOfPotions;
			if (numberOfPotions <= potionsInStock && (tempGold >= 0)){
				potionsInStock -= numberOfPotions;
				playerGold = tempGold;
				System.out.println("You Have " + playerGold + " gold leaft");
			}
			else if (numberOfPotions > potionsInStock){
				System.out.println("We dont have that many");
			}
			else {
				System.out.println("That is too expensive.");
			}
		}
		else if (itemChoce == 3){
			System.out.println("We have " + magicReagentsInStock + " Magic Reagents, " + magicReagentCost + " Gold each");
			System.out.println("How many do you want");
			int numberOfReagents = input.nextInt();
			tempGold = playerGold;
			tempGold -= magicReagentCost * numberOfReagents;
			if (numberOfReagents <= magicReagentsInStock && (tempGold >= 0)){
				magicReagentsInStock -= numberOfReagents;
				playerGold = tempGold;
				System.out.println("You Have " + playerGold + " gold leaft");
			}
			else if (numberOfReagents > magicReagentsInStock){
				System.out.println("We dont have that many");
			}
			else {
				System.out.println("That is too expensive.");
			}
		}
		else if (itemChoce == 4){
			System.out.println("We have " + magicScrollsInStock + " Magic Scrolls, " + magicScroleCost + " Gold each");
			System.out.println("How many do you want");
			int numberOfScrolls = input.nextInt();
			tempGold = playerGold;
			tempGold -= magicScroleCost * numberOfScrolls;
			if (numberOfScrolls <= magicScrollsInStock && (tempGold >= 0)){
				magicScrollsInStock -= numberOfScrolls;
				playerGold = tempGold;
				System.out.println("You Have " + playerGold + " gold leaft");
			}
			else if (numberOfScrolls > magicScrollsInStock){
				System.out.println("We dont have that many");
			}
			else {
				System.out.println("That is too expensive.");
			}
		}
		else if (itemChoce == 5){
			System.out.println("We have " + woodenShieldsInStock + " Wooden Shields, " + woodenShieldCost + " Gold each");
			System.out.println("How many do you want");
			int numberOfShields = input.nextInt();
			tempGold = playerGold;
			tempGold -= woodenShieldCost * numberOfShields;
			if (numberOfShields <= woodenShieldsInStock && (tempGold >= 0)){
				woodenShieldsInStock -= numberOfShields;
				playerGold = tempGold;
				System.out.println("You Have " + playerGold + " gold leaft");
			}
			else if (numberOfShields > woodenShieldsInStock){
				System.out.println("We dont have that many");
			}
			else {
				System.out.println("That is too expensive.");
			}
		}
	}
}