package kitty;

public class Countcycle {

	public static void main(String[] args) {
		
		System.out.println(countCyclesBurn(new int[] { 1, 0 }));

	}
	public static int countCyclesBurn(int[] data) {
	    int index = 0;
	    int count = 1;
	    while(data[index] >= 0) { // data[0]=1>0
	        int tmp = data[index]; //temp=1
	        data[index] = -(++count); //-2
	        
	        index = tmp;
	    }
	    return count + data[index] + 1;
	}

}
