package recursion;

public class SumOfDigits {
	
	static int sumOfDigits(int n) {
		int output;
		if(n==0)
		{
			return 0;
		}
		else
		{
			output=(int)n%10;
			return output+sumOfDigits(n/10);
		}

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(sumOfDigits(12));
	}

}
