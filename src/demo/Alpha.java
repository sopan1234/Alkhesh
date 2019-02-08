package demo;

public class Alpha {

	
	public static void main(String[] args) {
		
		
		for (int i = 1; i <=4; i++) {
			
			for (int k = 1; k <=i; k++) {
				
				System.out.print(" ");
			}
			
			char ch='A';
			for (int j = 4; j >=i; j--) {
				
				System.out.print(ch+" ");
				ch++;
				
			}
			System.out.println();
			
		}
	}
}
