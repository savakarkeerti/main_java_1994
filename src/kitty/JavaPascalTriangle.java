package kitty;

class  JavaPascalTriangle{
    public static int factorial(int i)
    {
        if (i == 0)
            return 1;
        return i * factorial(i - 1); // 5*4*3
    }
    public static void main(String[] args)
    {
        int n = 6, i, j;
        JavaPascalTriangle g = new JavaPascalTriangle();
        for (i = 0; i <= n; i++) {
            for (j = 0; j <= n - i; j++) {
 
                // for left spacing
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
 
                // nCr formula
                System.out.print(
                    
                    " "+ factorial(i)
                          / (factorial(i - j)
                             * factorial(j)));
            }
 
            // for newline
            System.out.println();
        }
        
        System.out.println(pascValue(5, 6));
    }
    
    public static int pascValue(int r, int n) {
    	//JavaPascalTriangle g = new JavaPascalTriangle();
    	int ret= (factorial(n)/(factorial(r)* factorial(n-r)));
    	
    	
    return ret;	
    }
}