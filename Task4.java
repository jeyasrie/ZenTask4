package javabase;

import java.util.Scanner;

public class Looptask4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		//get the input from user using scanner
		Scanner swap=new Scanner(System.in);
		
		int num1=swap.nextInt();
		int num2=swap.nextInt();
		System.out.println("Before Swapping Two Numbers");
		System.out.println("FirstNumber  " +num1);
		System.out.println("SecondNumber  " +num2);
		
		//swap two number using temp variable
		int temp=num1;
		num1=num2;
		num2=temp;
		
		System.out.println("After Swapping Two Numbers");
		System.out.println("FirstNumber  " +num1);
		System.out.println("SecondNumber  " +num2);

	}

}

//output
//Before Swapping Two Numbers
//FirstNumber  89736
//SecondNumber  10937
//After Swapping Two Numbers
//FirstNumber  10937
//SecondNumber  89736

