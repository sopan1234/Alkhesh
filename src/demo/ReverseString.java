package demo;

public class ReverseString {
	
	public static void main(String[] args) {
		
		String st="sopan Rane";
		
		String str[]=st.split("");
		
		for (int i = st.length()-1; i >=0; i--) {
			
			char c[]=str[i].toCharArray();
			
			System.out.print(c);
		}
		
		
	}

}
