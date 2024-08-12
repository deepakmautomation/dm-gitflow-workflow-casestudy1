package test;

public class Addition {

	public static void main(String[] args) {
		
		Addition add = new Addition();
		
		 int res = add.add(3, 6);
		 
		 System.out.println("Result is" + res);
	}
	
	public int add(int a, int b) {
		
		return a+b; 
	}

}
