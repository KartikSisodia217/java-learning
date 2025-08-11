import java.util.Scanner;
public class BinarySearch {
    public static void main (String[] a){
        // binary search in an already sorted array(ascending order)
        int[] array = {2,4,12,15,16,18,20,34,38,43,64,79,100};
        int start = 0;
        int end = array.length-1;
        boolean found = false;

        System.out.println("enter target : ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        while (start<=end){
            int mid = (start+end)/2;
            System.out.println("locating target...");
            if(array[mid]==target){
                System.out.println("target found at index "+ mid);
                found = true;
                break;
            }
            else if(array[mid]>target){
                end = mid-1;
            }
            else if (array[mid]<target){
                start = mid+1;
            }
        }
        if(!found){
            System.out.println("target not found in array.");
        }


    }
}
