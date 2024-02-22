package com.Task1;

import java.util.Scanner;

public class SmallestNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st no");
		int a=sc.nextInt();
		System.out.println("Enter the second no");
		int b= sc.nextInt();
		System.out.println("Enter the third no");
		int c= sc.nextInt();
		if(a<b && a<c) {
			System.out.println("A is smallest");
			
		}
		else if (b<c && b<a) {
			System.out.println("B is smallest");
		}
		else if(a==b && a==c && b==c){
			System.out.println("Please check the numbers");
		}
	else {
		System.out.println("C is smallest");
	}

}}
