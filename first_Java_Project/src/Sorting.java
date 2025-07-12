public class Sorting {
    public static void main (String args[]){
        int arr[] = {7,3,1,2,5};
        int arr2[] = {8,3,5,6,2};
        // bubble sort
        for (int i=0; i<arr.length - 1; i++){
            for (int j = 0;j<arr.length - i-1; j++ ){
                if (arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }

        }
        //selection sort
        for (int i=0; i<arr2.length - 1; i++){
            int smallest = i;
            for (int j = i+1;j<arr2.length; j++ ){
                if (arr2[smallest]>arr2[j]) {
                    int temp1 = arr2[smallest];
                    arr2[smallest] = arr2 [j];
                    arr2 [j] = temp1;
                }
            }
        }


        for (int k=0; k<arr.length; k++){
            System.out.println(arr[k]);
        }
        System.out.println();
        for (int k=0; k<arr2.length; k++) {
            System.out.println(arr2[k]);
        }


        
    }
}
