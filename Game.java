import java.util.Scanner;

public class Game {
    public static void gamestart()
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lets play press 1 \n Exit press 2");
        int option = scanner.nextInt();
        switch (option)
        {
            case 1 :
                Gameperform.play();
                break;
            case 2:
                System.out.println("Exiting...");
                break;
        }
    }
}
