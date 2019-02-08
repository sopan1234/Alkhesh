package demo;

public class BubbleSort {
	
	public static void main(String[] args) {
		
		int a[]={50,20,70,80,30};
		
		int temp;
		
		for (int i = 0; i < a.length; i++) {
			
			for (int j = 0; j < a.length-1-i; j++) 
			{
				if(a[j]>a[j+1])
				{
				temp = a[j];
				
				a[j] = a[j+1];
				
				a[j+1] = temp;
				
			}
			}
			System.out.print(" " +a[i]);

		}
		
		
	}

}
