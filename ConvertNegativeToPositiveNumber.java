package Week1.day1;

public class ConvertNegativeToPositiveNumber {
	
	public static void main(String[] args) {
		int number = -40;
		
		if(number<0) {
			int positivenumber = Math.abs(number);
			System.out.println(positivenumber);
			System.out.println( "The number -40 is converted to 40");
			
		}
		
	}

}
