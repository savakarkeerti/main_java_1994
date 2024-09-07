package kitty;

public class Snowpack {

    public static void main(String[] args) {
        int arr[] = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println(snowpack(arr));
    }
 // Function to return the maximum
 // water that can be stored
    private static int snowpack(int[] arr) {
        int left = 0, right = 0;
        int count = 0;
        for (int i = 1; i < arr.length; i++) {// 1
            left = arr[i];
            for (int j = 0 ; j < i; j++) {
                left = Math.max(left, arr[j]); // finding maximum in left // 0,1
            }
            right = arr[i];
            for (int k = i + 1; k < arr.length; k++) {
                right = Math.max(right, arr[k]); // finding maximum in right 3
            }
            // System.out.println(count +" counts"+" i values  "+ i);
            // System.out.println(left+ " left "+ right+" right "+ arr[i] );
            count = count + (Math.min(left, right) - arr[i]);// (1,3)-0= 1
        }
        return count;
    }
}

