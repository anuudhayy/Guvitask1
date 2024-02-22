package com.Task1;

import java.util.Scanner;

public class ReverseNumber {
public static void main(String[] args) {
	//initialization
	int reverse=0;
	//to get input from user
	Scanner scanner = new Scanner(System.in);
	System.out.println("Enter the number");
	//to store the number 
	int num=scanner.nextInt();
	System.out.println("The number to be reversed:" + num);
	//to check and enter the loop
	while(num!=0) {
		//it gives the remainder
		int remainder=num%10;
		reverse=reverse*10+remainder;
		//it gives the quotient
		num=num/10;
		
		
	}
	System.out.println("The reversed no is:" + reverse);
}
}
