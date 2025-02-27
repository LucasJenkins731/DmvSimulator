import java.util.*;

public class DmvSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to the DMV!");

        int range = 200;
        int number = random.nextInt(range);

        int miracle = random.nextInt(100);

        System.out.println("Your number is " + number + ". Please wait until your number is called.");

        int wait = number + 1;

        while (wait != number) {
            System.out.println("Called number: " + wait);
            if (wait > range) {
                wait = 1;
            }
            wait++;
        }
        System.out.println("Called number: " + number);
        System.out.println("Thank you for waiting!");

        if (miracle == 3) {
            System.out.println("Thank you for filling out your paperwork properly. Have a good day!");
        }
        else {
            System.out.println("You didnt read the instructions? Wrong form. Your mistake not mine. NEXT!");
        }
    }
}
