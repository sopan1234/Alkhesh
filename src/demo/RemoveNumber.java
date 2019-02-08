package demo;

public class RemoveNumber {
	
	public static void main(String[] args) {
		
		String st="java by kiran";
		
		char c[]=st.toCharArray();
		
		for (int i = 0; i < c.length; i++) {
			
			if (c[i]==' ') {
				
				c[i+1]=(char) (c[i+1]-32);
				
			}
			
			System.out.print(c);
		}
			
		}
		
	}

