package recursion;

public class DigitalRoot {
	  public static int digitalRoot(int n) {
	        // code here
	        int output;
	        if(n<10)
	        {
	            return n;
	        }
	        else
	        {
	          output=sumofdigits(n);
	          return digitalRoot(output);
	        }
	        
	    }
	    
	    public static int sumofdigits(int n) {
	        // code here
	        int output1;
	        if(n==0)
	        {
	            return 0;
	        }
	        output1=n%10;
	        return output1+sumofdigits(n/10);
	        
	    }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println(digitalRoot(99));
	}

}
