public class GuessingGame {
    public static void main(String[] args) {

        int secretNumber = 8;
        int guess = 6;

        if (guess == secretNumber) {
            System.out.println("You have guessed correctly!");
        } else if (guess < secretNumber) {
            System.out.println("That is not correct. Your guess is too low!");
        } else  {
            System.out.println("That is not correct. Your guess is too high!");
        }
    }
}
