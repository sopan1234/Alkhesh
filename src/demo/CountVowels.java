package demo;

public class CountVowels {
	public static void main(String[] args) {
		
	
	
	String str="java  programing";
	
	char ch[]=str.toCharArray();
	
	int i=str.length();
	
	int count=0, count1=0;
	for (char c : ch) 
		
		 {
		
			 if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			 {
				 count++;
			 }
			 else if(!(c==' ')) 
			 {
				count1++;
			 
			}
		 }
		 
		 System.out.println(count);
		 
		 System.out.println(i-count);
		 }
	
	
	}		

