class designs{
    public String pattern1(){
        int i=1;
        int j=1;
        for (i=1; i<=4; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
        return "pattern 1 printed";
    }
    public String pattern2(){
        for (int i=1; i<=4;i++){
            for (int j=(4-i);j>=0;j--){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            for (int j =1; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return "pattern 2 printed";
    }
    public String pattern3(){
        for (int i=1; i<=4;i++){
            for (int j=(3-i);j>=0;j--){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            for (int j =1; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        for(int i=1; i<4; i++){
            for(int j=1; j<=i; j++){
                System.out.print(" ");
            }
            for(int j=(3-i);j>=0;j--){
                System.out.print("*");
            }
            for(int j=(2-i);j>=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        return "pattern 3 printed";
    }
    public String pattern4(){
        for(int i=1; i<4; i++){
            for(int j=1; j<i; j++){
                System.out.print(" ");
            }
            for(int j=(4-i);j>=0;j--){
                System.out.print("*");
            }
            for(int j=(3-i);j>=0;j--){
                System.out.print("*");
            }
            System.out.println("");
        }
        for (int i=1; i<=4;i++){
            for (int j=(3-i);j>=0;j--){
                System.out.print(" ");
            }
            for (int j =1; j<=i; j++){
                System.out.print("*");
            }
            for (int j =1; j<i; j++){
                System.out.print("*");
            }
            System.out.println("");
        }
        return "pattern 4 printed";
    }
    public String pattern5(){
        for (int i=1; i<=4;i++){
            for (int j=1; j<=7; j++){
                if(i==1 || j==1 || i==4 || j==7) {
                    System.out.print("*");
                }
                else{
                        System.out.print(" ");
                    }
            }
            System.out.println("");
        }
        return "pattern 5 printed";
    }

}

public class Pattern {
    public static void main (String args[]){
        designs des= new designs();
        System.out.println(des.pattern1());
        System.out.println(des.pattern2());
        System.out.println(des.pattern3());
        System.out.println(des.pattern4());
        System.out.println(des.pattern5());
    }
}
