package com.Task1;

import java.util.Scanner;

public class TotalCost {

	public static void main(String[] args) {
       float totalcost,discount,payable_amount;
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter the totalamount");
       totalcost=sc.nextFloat();
       if(totalcost<500) {
    	   payable_amount=totalcost;
    	   System.out.println("The amount should be paid:"+payable_amount);
    	   System.out.println("No dicount is applied");
       }
       if(totalcost>=500 && totalcost<=1000) {
    	   discount=totalcost*10/100;
    	   payable_amount=totalcost-discount;
    	   System.out.println("you are eligible for 10% discount");
    	   System.out.println("The amount should be paid:"+payable_amount);
    	   
       }
       if(totalcost>1000) {
    	   discount=totalcost*10/100;
    	   payable_amount=totalcost-discount;
    	   System.out.println("you are eligible for 20% discount");
    	   System.out.println("The amount should be paid:"+payable_amount);
    	   
       }
	}

}
