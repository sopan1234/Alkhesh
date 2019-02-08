package demo;

import java.util.Scanner;

public class Pattern1 {

	
	public static void main(String[] args) {
		
		System.out.println("Enter a number");
		
		Scanner sc=new Scanner(System.in);
		
		int i=sc.nextInt();
		
		for(i=1;i<=4;i++)
			
		{
		/*	for(int k=3;k>=i;k--)
			{
				System.out.print(" ");
			}
		*/	
			for(int j=4;j>=i;j--)
			{
				System.out.print("*");
			}
			
			System.out.println();
		}
		
	}
}
