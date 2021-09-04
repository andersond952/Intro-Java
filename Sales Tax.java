package problem1;

import java.util.Scanner;

public class SalesTax 
{
	public static void main(String[] args)
	{
	      // Variables
	      double purchase;         // Amount of purchase
	      double stateTax;         // Amount of state sales tax
	      double countyTax;        // Amount of county sales tax
	      double totalTax;         // Total sales tax
	      double totalCost;        // Total cost of the purchase
	      
	      // Create a Scanner object for keyboard input.
	      Scanner keyboard = new Scanner(System.in);
	       
	      System.out.print("Enter the State Tax: ");
	      stateTax = keyboard.nextDouble();
	      
	      System.out.print("Enter the County Tax: ");
	      countyTax = keyboard.nextDouble();
	      
	      // Get the amount of the purchase.
	      System.out.print("Enter the purchase amount: ");
	      purchase = keyboard.nextDouble();
	      
	      keyboard.close();
	      
	      // Calculate the state sales tax.
	      stateTax = purchase * stateTax;
	      
	      // Calculate county sales tax.
	      countyTax = purchase * countyTax;
	      
	      // Calculate the total sales tax.
	      totalTax = stateTax + countyTax;
	      
	      // Calculate the total purchase cost.
	      totalCost = purchase + totalTax;
	      
	      // Display the results.
	      System.out.println("Purchase amount: $" + purchase);
	      System.out.println("State tax: $" + stateTax);
	      System.out.println("County tax: $" + countyTax);
	      System.out.println("Total tax: $" + totalTax);
	      System.out.println("Total cost: $" + totalCost);
	   }
	}
