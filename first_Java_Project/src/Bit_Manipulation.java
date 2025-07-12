public class Bit_Manipulation
{
    /*
      find out what the third bit is in the number 5 (0101)
     */
    public static void main (String args[]){
        int n = 5;    //0101
        int pos = 2;
        int bitmask = 1<<pos; // 0001 --> 0100
        if((bitmask & n) == 0){
            System.out.println("bit was zero");
        }
        else{
            System.out.println("bit was one");
        }
    }
}

 