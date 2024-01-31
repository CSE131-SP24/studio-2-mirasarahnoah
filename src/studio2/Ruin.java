package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter start amount: ");
		double startAmount = in.nextDouble();
		System.out.println("Enter win chance: ");
		double winChance = in.nextDouble();
		System.out.println("Enter win limit: ");
		double winLimit = in.nextDouble();
		System.out.println("How many days do you want to gamble for? ");
		double totalSimulations = in.nextDouble();
		
		
		
	 for(int day = 0; day <= totalSimulations; day++) {
	    double amount = startAmount;
		while ((amount < winLimit) && (amount > 0)) {
			double randomNumber = Math.random();
			
			if (randomNumber > winChance)
			{
				amount ++;
			}
			else
			{
				amount --;
			}System.out.println(day + ":" + " You have $" + amount);
		}
			
	
			{
				
			}
			
		}
		}
		
		
		
		
		
		
		
		
		{
			
			
		}
		}
		
		
		
				
		
		
		
		
	


