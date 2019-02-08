
public class fibonical {
	
	public static void main(String[] args) {
		
		int max=10;
		
		int prv=0;
		
		int next=1;
		
		for (int i = 1; i <= max; i++) {
			
			System.out.println(prv+"");
			
			int sum=prv+next;
			
			prv=next;
			
			next = sum;
			
			
		}
	}

}
