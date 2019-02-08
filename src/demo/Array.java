package demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Array {
	
	public static void main(String[] args) {

		ArrayList<Integer> al=new ArrayList<>();
		
		al.add(10);
		al.add(20);
		al.add(20);
		al.add(20);
		al.add(40);
		
		System.out.println(al);
		
		Collections.synchronizedList(al);
		
		System.out.println(al);
		
		HashSet<Integer> s=new HashSet<>(al);
		
		System.out.println();
		
	}

}
