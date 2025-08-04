package recursion;

public class CountOfDigits {
	public int countDigits(int n) {
        // code here
        int count;
        if(n==0)
        
        {
            return 0;
        }
    
        count=+1;
        return count+countDigits((int)n/10);
    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CountOfDigits c=new CountOfDigits();
		System.out.println(c.countDigits(0));
	}

}
