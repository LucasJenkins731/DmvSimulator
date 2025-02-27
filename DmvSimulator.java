import java.util.*;

public class DmvSimulator {
    public static void main(String[] args) {
        Random random = new Random();
        System.out.println("Welcome to the DMV!");

        int number = random.nextInt(100);

        System.out.println("Your number is " + number + ". Please wait until your number is called.");
    }
}
