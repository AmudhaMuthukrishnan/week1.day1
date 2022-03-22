package Week1.day1;

public class PositiveOrNegativeNumber {
	
	public String positiveOrNegative()
	{
		int number = 35;
	
			if (number>0)
		{
			return "The number is positive";
			}else if(number<0){
				return "The number is negative";
			}else {
				return "The number is neither positive nor negative";
			
			}
	}
	
	public static void main(String[] args) {

		PositiveOrNegativeNumber obj = new PositiveOrNegativeNumber();
		System.out.println(obj.positiveOrNegative());
}
}
