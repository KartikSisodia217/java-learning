import java.util.Scanner;
// binary search in an unsorted array


//sorting an array for binary search
class Sort{
    public static int[] ascend(int[] arr){
        for (int i=0; i<arr.length - 1; i++){
            for (int j = 0;j<arr.length - i-1; j++ ){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        return arr;
    }
}


//binary search
public class BinarySearch2 {
    public static void main(String[] a){
        int[] array = {3,56,43,21,34,100,98,1,34,190,12,2,53,97,33,47};
        int[] sorted_arr = Sort.ascend(array);
        int start = 0;
        int end = sorted_arr.length-1;
        boolean found = false;

        System.out.println("enter target : ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        while (start<=end){
            int mid = (start+end)/2;
            System.out.println("locating target...");
            if(sorted_arr[mid]==target){
                System.out.println("target found in array");
                found = true;
                break;
            }
            else if(sorted_arr[mid]>target){
                end = mid-1;
            }
            else if (sorted_arr[mid]<target){
                start = mid+1;
            }
        }
        if(!found){
            System.out.println("target not found in array.");
        }
    }
}
