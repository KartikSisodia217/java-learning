import java.util.Scanner;
public class Arrays {
    public static void main (String args[]){
        //store the roll numbers of 5 students
        int[] roll_no = new int[5];
        roll_no[0]=3;
        roll_no[1]=45;
        roll_no[2]=22;
        roll_no[3]=35;
        roll_no[4]=9;
        //or directly we can write
        int[] rnos = {23,5,42,34,55};

        for (int i=0; i<5; i++){
            System.out.println("roll no = " + roll_no[i]);
        }

        for (int i=0; i<5; i++){
            System.out.println("r.no = " + rnos[i]);
        }


        // store the marks of "n" students in an array and calculate their average:
        Scanner input = new Scanner(System.in);
        Scanner data = new Scanner(System.in);
        System.out.println("Enter number of students : ");
        int n = input.nextInt();
        float[] marks = new float[n];
        for (int i = 0; i<n; i++){
            System.out.println("enter marks of student " + (i+1) + " : ");
            marks[i] = data.nextInt();
        }
        for (int i=0; i<n; i++){
            System.out.println("marks of student" +(i+1)+ " = " + marks[i]);
        }
        float total = 0;
        for (int i = 0; i<n; i++){
            total += marks[i];
        }
        float avg = total / n;
        System.out.println("Average marks of class : " + avg);
    }
}
