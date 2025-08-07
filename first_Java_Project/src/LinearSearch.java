import java.util.Scanner;
public class LinearSearch {
    public static void main(String args[]){
        int[] array = {2,4,12,15,16,18,20,34,38,43,64,79,100};
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
