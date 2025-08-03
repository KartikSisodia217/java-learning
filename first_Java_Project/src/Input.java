import java.util.Scanner;

public class Input {
    public static void main(String args[]){
        System.out.println("enter your name:");
        Scanner input = new Scanner(System.in);

        System.out.println("your name is : " + input.nextLine());



        System.out.println("enter your age:");
        Scanner input2 = new Scanner(System.in);
        int age =  input2.nextInt();
        System.out.println("your age is : " + age);
        System.out.println("your age in 10 years will be : " + (age + 10));
        System.out.println("thank you!");
    }
}
