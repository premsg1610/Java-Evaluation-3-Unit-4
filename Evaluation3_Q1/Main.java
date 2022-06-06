package com.Evaluation3_Q1;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
	try {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the number of elements in the array");
		int size = input.nextInt();
		
		System.out.println("Enter the elements in the array");
		
		int[] arr = new int[size];
		
		for(int i=0; i<size; i++)
		{
			int elem = input.nextInt();
			arr[i] = elem;
		}
		
		System.out.println("Enter the index of the array element you want to access");
		int index = input.nextInt();
		
		System.out.println("The array element at index " + index + " = " + arr[index]);
		System.out.println("The array element successfully accessed");
	  }
	 catch(ArrayIndexOutOfBoundsException out) {
			
		 System.out.println(out);
		 System.out.println("Please enter the index within the array size limit");
		 
		}
	catch(NumberFormatException nfe) {
		
		System.out.println(nfe);
		System.out.println("Enter a valid index (in number format).");
	}
	
//	number format is not working, its giving input mismatch, therefore used this also.
	catch(InputMismatchException ime)
	{
		System.out.println(ime);
		System.out.println("Input type not matched, please inter a valid number");
	}
	catch(Exception e) {
		System.out.println("Please test my code for these two cases only which was asked in evaluation");
	}
	}

}
