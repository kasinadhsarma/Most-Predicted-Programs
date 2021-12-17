package Alphabets;

import java.util.Scanner;

public class TriangleCharacter1 {

	private static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);	
		
		System.out.print("Enter Triangle Character Pattern Rows = ");
		int rows = sc.nextInt();
		
		System.out.println("Printing Triangle Character/Alphabets Pattern");
		
		for (int i = 0 ; i < rows; i++ ) 
		{
			int alphabet = 65;
			for (int j = rows ; j > i; j-- ) 	
			{
				System.out.print(" ");
			}
			for (int k = 0 ; k <= i; k++ ) 	
			{
				System.out.print((char)(alphabet + k) + " ");
			}
			System.out.println();
		}
	}
}