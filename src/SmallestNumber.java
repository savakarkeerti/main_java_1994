package kitty;

public class SmallestNumber {
	
	public static void main(String[] args) {
		int arr2[]= {10,3,6,7,8,2,19,99};
		System.out.println(smallest(arr2));
		
		
	}
	// sort 
	public static int smallest(int arr[]) {
	 
		int size=arr.length;
		int temp = 0;
		for(int i=0;i<size;i++) {
			for(int j=i+1;j<size;j++) {
				
				if (arr[i]>arr[j]) {
					temp=arr[j];
					arr[j]=arr[i];
					arr[i]=temp;
				}
			}
		}
		System.out.println(arr[1]+" is 2nd smallest");
		return arr[0];
		
		
	}

}
