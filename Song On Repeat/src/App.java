import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        boolean isOnRepeat = true;
        while (isOnRepeat) {
            System.out.println("Playing Current Song");
            System.out.println("Want to take out of repeat? If so, answer yes");
            String userInput = input.next();

            if (userInput.equals("yes")) {
                isOnRepeat = false;
            }
        }
        System.out.println("Playing Next Song");
    }
}