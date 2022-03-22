package Week1.day1;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		int input = 31;
		boolean flag = false;
		int halfInput = (Math.round(input/2));
		System.out.println(halfInput);
		for(int i=2; i<= halfInput; i++)
		{
			if (input%i== 0)
			{
			flag = true;
			break;
				
			}
			
		}
		if (flag == true)
		{
			System.out.println("Pime Number");
		}else{
			System.out.println(" Not Prime Number");
		}
	}

	
	}

