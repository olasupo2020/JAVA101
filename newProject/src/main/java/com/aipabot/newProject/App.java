package com.aipabot.newProject;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {/*
        System.out.println( "Welcome to self serve Teller" );
        
        Scanner scanner = new Scanner(System.in);
    	System.out.println(" Enter the items: ");
    	int itemList = scanner.nextInt();
    	    	
    	System.out.println("Enter the amount of the item: " );
    	double amountOfItemList = scanner.nextInt();
    	
    	System.out.println("Enter a promo Code: ");
    	String promoCode = scanner.next();
    	double totalAmountOfItemList = itemList * amountOfItemList;
    	double discountedAmount = totalAmountOfItemList * 0.10;
    	
    	if (totalAmountOfItemList>=199.99 && promoCode.equalsIgnoreCase ("Summer2020"))
    		
    	{ double discountedAmountOfItemList = totalAmountOfItemList - discountedAmount; 
    	
    		System.out.println("Your discount is $" + discountedAmount + "and discounted total cost of item is :$" + discountedAmountOfItemList);
    	}
    		else 
    	{
    			System.out.println(" You are not qualify for promotion at this time, please try again later:" + totalAmountOfItemList);
    	
    	}
    
    
    	
       	String[] itemNames = new String[5];  //0,1,2,3,4
    	int size = itemNames.length;
    	double[] itemPrices = new double[size];
    	int[] itemQuantities = new int[size];
    	double[] totalCostPerItems = new double[size];
    	
    	Scanner input = new Scanner(System.in);
    	double totalAmount = 0.0; //Accumulator
    	System.out.println("ItemName \t |");
    	System.out.println("itemPrices \t |");
    	System.out.println("itemQuantities \t |");
    	System.out.println("totalCost \t ");
    	
    	for (int i = 0; i < size; i++) {
    		System.out.println("Enter item Name: " );
    		String itemName = input.nextLine();
    		itemNames[i] = itemName;
    		
    		System.out.println("Enter item Quantity: " );
    		int itemQuantity = input.nextInt();
    		itemQuantities[i] = itemQuantity;
    		
    		System.out.println("Enter item price: " );
    		double itemPrice = input.nextDouble();
    		itemQuantities[i] = itemQuantity;
    	}
    	{
    	
    	}
    		
    String[] studentNames = new String[3];
    studentNames[0]="June";
    studentNames[1]="May";
    studentNames[2]= "Sept";		
    
    		
    for (int i=0; i<studentNames.length;i++) 
{
    	System.out.println("Student "+ (i+1) + "is " + studentNames[i]);
    }
    */
    	
    	Scanner input = new Scanner(System.in);
    	System.out.println("Enter student Marks : " );
    	    	
       	int average = input.nextInt();
     	System.out.println("student name is  : " );
    	if (average>=70 && average>= 100) {
    	
    		System.out.println("Your grade is A " + "And your point is : 5.0 "  );
    	}
    	
    		else if (average >= 60 && average >= 69) {
    			System.out.println("Your grade is B " + "And your point is : 4.0 "  );
    	}
    		else if (average >=50  && average >= 59) {
    			System.out.println("Your grade is C " + "And your point is : 3.0 "  );
    	}
    		else if (average >= 40 && average >= 49) {
    			System.out.println("Your grade is D " + "And your point is : 2.0 " );
    	}
    		else if (average >= 35 && average >= 39) {
    			System.out.println("Your grade is E " + "And your point is : 1.0 "  );
    	}
    }
    
    }

