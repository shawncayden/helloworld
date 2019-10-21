package helloworld;
import java.util.Scanner;

public class CommissionCalc {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in); // Name scanner
		System.out.println("Please enter employee's name:");
		String name = input.nextLine();
		
		System.out.println("Please enter employee's sales:");
		double sales = input.nextDouble();
		
		System.out.println("Please enter employee's commission %:");
		double perc = input.nextDouble();
		double percEnd = perc / 100;
		
		double payout = percEnd * sales;
		
		System.out.println(name + " is owed $" + payout + "0");
		
		// System.out.println(name);J
		
	}

}
