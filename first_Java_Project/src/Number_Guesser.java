import java.util.Scanner;
public class Number_Guesser {
    public static void main(String args[]){
        System.out.println("Welcome to the number guesser game!");
        Scanner diff = new Scanner(System.in);
        String difficulty;
        while (true){
            System.out.println("Choose difficulty: ");
            System.out.println("easy: 0 to 100");
            System.out.println("moderate: 0 to 1000");
            System.out.println("hard: 0 to 10000");
            System.out.println("end: to stop the game.");
            difficulty = diff.nextLine();


            if(difficulty.equals("easy") || difficulty.equals("Easy")){
                System.out.println("generating random number...");
                System.out.println("generating random number...");
                System.out.println("generating random number...");
                System.out.println("number generated. The range of the required numbers is from 0 to 99.");
                int number = (int) (100* Math.random());
                boolean unknown = true;
                Scanner input = new Scanner(System.in);
                int attempts = 0;
                while (unknown) {
                    System.out.println("enter new guess here : ");
                    int guess = input.nextInt();
                    if(guess > number){
                        attempts ++;
                        System.out.println("your guess is higher than the required number.");
                    }
                    else if(guess<number){
                        attempts ++;
                        System.out.println("your guess is lower than the required number.");
                    }
                    else{
                        attempts ++;
                        System.out.println("congratulations! You have guessed the correct number, "+ number + " , in " + attempts +" tries." );
                        System.out.println("restarting game...");
                        unknown = false;
                    }
                }
            }


            else if(difficulty.equals("moderate") || difficulty.equals("Moderate")){
                System.out.println("generating random number...");
                System.out.println("generating random number...");
                System.out.println("generating random number...");
                System.out.println("number generated. The range of the required numbers is from 0 to 999.");
                int number = (int) (1000* Math.random());
                boolean unknown = true;
                Scanner input = new Scanner(System.in);
                int attempts = 0;
                while (unknown) {
                    System.out.println("enter new guess here : ");
                    int guess = input.nextInt();
                    if(guess > number){
                        attempts ++;
                        System.out.println("your guess is higher than the required number.");
                    }
                    else if(guess<number){
                        attempts ++;
                        System.out.println("your guess is lower than the required number.");
                    }
                    else{
                        attempts ++;
                        System.out.println("congratulations! You have guessed the correct number, "+ number + " , in " + attempts +" tries." );
                        System.out.println("restarting game...");
                        unknown = false;
                    }
                }

            }


            else if(difficulty.equals("hard") || difficulty.equals("Hard")){
                System.out.println("generating random number...");
                System.out.println("generating random number...");
                System.out.println("generating random number...");
                System.out.println("number generated. The range of the required numbers is from 0 to 9999.");
                int number = (int) (10000* Math.random());
                boolean unknown = true;
                Scanner input = new Scanner(System.in);
                int attempts = 0;
                while (unknown) {
                    System.out.println("enter new guess here : ");
                    int guess = input.nextInt();
                    if(guess > number){
                        attempts ++;
                        System.out.println("your guess is higher than the required number.");
                    }
                    else if(guess<number){
                        attempts ++;
                        System.out.println("your guess is lower than the required number.");
                    }
                    else{
                        attempts ++;
                        System.out.println("congratulations! You have guessed the correct number, "+ number + " , in " + attempts +" tries." );
                        System.out.println("restarting game...");
                        unknown = false;
                    }
                }
            }
            else if(difficulty.equals("end") || difficulty.equals("End")){
                System.exit(0);
            }

        }

    }
}
