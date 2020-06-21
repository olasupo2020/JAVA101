package com.aipabot.firstjava;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    { // I am an amazing programmer
    	
    /* I will run the java program like a pro. let's wait and see what will happen 
     * in the next couple of months
     */
    	/* calculate the total price of 8 items at $3 each and subtract the cost of 2 items 
    	 * from the total price, display the amount to be paid after discount*/
    	
    	int totalPrice;
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
    	
    		
    				
    	
    }
}
