package recursion;

public class Printnto1 {
	
	public static void print_n_to_1(int num)
	{
		if(num==0)
		{
			return;
		}
	
		System.out.println(num);
			 print_n_to_1(num-1);
		}
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		print_n_to_1(5);
	}

}
