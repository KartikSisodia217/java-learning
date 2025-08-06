import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]){
        int[] array = {2,45,11,54,32,22,12,34,32,15,65,98,77,1,94,17};
        System.out.println("Enter required target : ");
        Scanner input = new Scanner(System.in);
        int target = input.nextInt();
        boolean targetfound = false;
        for(int i=0; i<array.length; i++){
            int element = array[i];
            System.out.println("locating target...");
            if(element == target) {
                System.out.println("target " + target + " has been found at index " + i+" .");
                targetfound = true;
                break;
            }

        }
        if(!targetfound){
            System.out.println("the target was not found in the array.");
        }
    }
}
