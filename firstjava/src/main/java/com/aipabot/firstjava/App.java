package com.aipabot.firstjava;

import java.text.NumberFormat;
import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class App 
{
    private static final double Summer2020 = 0;

	public static void main( String[] args, double moreThanTwoHundredAndApplyPromoCode )
    { // I am an amazing programmer
    	
    /* I will run the java program like a pro. let's wait and see what will happen 
     * in the next couple of months
     */
    	/* calculate the total price of 8 items at $3 each and subtract the cost of 2 items 
    	 * from the total price, display the amount to be paid after discount*/
    	
   /*
     
    	int quantity = 8;
    	int price = 3;
    	int discountCheck = 20;
    	int newPriceAfterDiscount=0;
    			
    		totalPrice = quantity * price;
    		
    		if (totalPrice> discountCheck )
    { newPriceAfterDiscount = totalPrice - (2*price);			
    				
    			totalPrice -= price;
    		}
    				
    		
    	   
    		System.out.println( "totalPrice = " + totalPrice);
        	System.out.println( "newPriceAfterDiscount =" + newPriceAfterDiscount);	
    	
    		
        	Scanner scanner = new Scanner(System.in);
        	System.out.println("Enter value for x: ");
        	int x = scanner.nextInt();
        	System.out.println("The value of x is " + x);
        	
        	System.out.println("Enter value for y: ");
        	int y = scanner.nextInt();
        	System.out.println("The value of y is " + y);
    		
        	//2x + (y + 3x * 4y)-2x
        	
        	int xy = (2 * x + (y + 3*x * 4*y ) - 2*x);
        	
        	System.out.println("2x +(y +3x * 4y) - 2x = "  + xy);
        	*/
        	
    	  // Summer2020 code application logic here


        Scanner input = new Scanner(System.in);
        NumberFormat currency = NumberFormat.getCurrencyInstance();


        //Variables 
        double amountSpent=0;
        double couponAmount = amountSpent * 0.10;
		double totalAfterCoupon = amountSpent - couponAmount; 
        final double moreThanTwoHundred = 0.00;
        final double promoCode = Summer2020;
        
        
        
        System.out.print("Please enter the cost of your groceries: ");
        amountSpent = input.nextDouble();
        
               if (amountSpent>=200 && promoCode == Summer2020)
        {
        	      	
        	System.out.printf("applying promocode Summer2020, ", currency.format(totalAfterCoupon), "(10% of your purchase)");
        }
        else if (amountSpent<=199.99 && promoCode != Summer2020)
        {
            couponAmount = 0;
            
            System.out.printf("Error applying promo code pay actual price  ", currency.format(amountSpent));
       
        }

        System.out.printf("the coupon amount is: %f ", couponAmount); 
        
        System.out.printf("Total price is $ ", currency.format(totalAfterCoupon));
    		

    	
    }
	
}
