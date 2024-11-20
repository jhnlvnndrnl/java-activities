import java.util.*;

public class ACT12 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter 1st Number: ");
        int number1 = scn.nextInt();

        System.out.print("Enter 2nd Number: ");
        int number2 = scn.nextInt();

        System.out.print("Enter 3rd Number: ");
        int number3 = scn.nextInt();

        System.out.print("Enter 4th Number: ");
        int number4 = scn.nextInt();

        System.out.print("Enter 5th Number: ");
        int number5 = scn.nextInt();

        System.out.println(" ");

        int[] numbers = { number1, number2, number3, number4, number5 };

        Arrays.sort(numbers);

        System.out.println("The lowest number is " + String.valueOf(numbers[0]));
        System.out.println("The highest number is " + String.valueOf(numbers[4]));

    }
}