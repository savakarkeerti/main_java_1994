package kitty;

public class Power {
	
	// Function to calculate N raised to the power P
    static double power(int N, int P)
    {
        int pow = 1;
        //double pow1=1;
        if(P==0 )
        	return 1;
       
        if(P<0) {
        	P=-1*P;
        	
        	 for (int i = 1; i <= P; i++) {
                 pow *= N;
            
             }
        	 return (1.0/pow);
        }
        
        else {
        	 for (int i = 1; i <= P; i++) {
                 pow *= N;
             
             }
        	 return pow;
        }
    }
  
    // Driver code
    public static void main(String[] args)
    {
        int N = 2;
        int P = 2;
  
        System.out.println(power(N, P));
    }

}
