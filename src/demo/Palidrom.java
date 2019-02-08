package demo;

import java.util.Scanner;

public class Palidrom {
	
	public static void main(String[] args) {
		
		System.out.println("Enter a string");
		
		Scanner sc=new Scanner(System.in);
		
		String str=sc.nextLine();
		
		String rev="";
		
		for (int i = str.length()-1; i >=0;i--) {
			
			rev=rev+str.charAt(i);
			
				}
		System.out.println(rev);
		
		if(str.equals(rev))
		{
			System.out.println("is palidrom");
		}
		else
		{
			System.out.println("is not palidrom");
		}
		
		
	}

}
