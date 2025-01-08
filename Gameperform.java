import java.util.Random;
import java.util.Scanner;

public class Gameperform {
    public static void play() {
        Scanner scanner = new Scanner(System.in);
        int user_score=0 ;
        int computer_score=0;
        System.out.println("Lets start the game !!!");
        while (true) {

            if (user_score == 5 || computer_score == 5) {
                if (user_score >= computer_score) {
                    System.out.println("User is won the match!!");
                    System.out.println("Score :" + user_score);
                    System.out.println();
                    System.out.println("Cointinue the game press 1\n otherwise press 2");
                    int option = scanner.nextInt();
                    switch (option) {
                        case 1:
                            play();
                            break;
                        case 2:
                            break;
                    }


                } else {
                    if (user_score <= computer_score) {
                        System.out.println("System is won the match!!");
                        System.out.println("Score :" + computer_score);
                        System.out.println();
                        // Game.gamestart();
                        System.out.println("Cointinue the game press 1\n otherwise press 2");
                        int option = scanner.nextInt();
                        switch (option) {
                            case 1:
                                play();
                                break;
                            case 2:
                                break;
                        }

                    }
                }break;
            }

            Random random = new Random();
            int randomnumber = random.nextInt(1, 10);

            System.out.println("Enter your guessing number");
            int guessing_number = scanner.nextInt();
            if (guessing_number == randomnumber) {
                user_score++;

                System.out.println("User got a point!!!");
            } else if (guessing_number != randomnumber) {
                computer_score++;

                System.out.println("System got a point!!!");
            }
        }
    }

}
