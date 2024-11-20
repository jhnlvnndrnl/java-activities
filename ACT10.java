import java.util.*;
public class ACT10{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
    
        Line();
        Space();

        System.out.print("Enter First Number: ");
        double num1 = scn.nextDouble();
        System.out.print("Enter Second Number: ");
        double num2 = scn.nextDouble();

        Space();
        Line();
        Space();
        Menu();
        Space();
        Line();
        Space();

        System.out.print("Choose class: ");
        String output = scn.next();

        Space();
        Line();

            if (output.equalsIgnoreCase("pow")) {
                double p = Math.pow(num1, num2);
                System.out.println("The answer is "+ p);
            } else if (output.equalsIgnoreCase("round")) {
                double r = Math.round(num2);
                System.out.println("The answer is "+ r);
            } else if (output.equalsIgnoreCase("min")) {
                double mn = Math.min(num1, num2);
                System.out.println("The answer is "+ mn);
            } else if (output.equalsIgnoreCase("max")) {
                double mx = Math.max(num1, num2);
                System.out.println("The answer is "+ mx);
            } else if (output.equalsIgnoreCase("ceil")) {
                double c = Math.ceil(num1);
                System.out.println("The answer is "+ c);
            } else if (output.equalsIgnoreCase("floor")) {
                double f = Math.floor(num2);
                System.out.println("The answer is "+ f);
            } else if (output.equalsIgnoreCase("abs")) {
                double a = Math.abs(num1);
                System.out.println("The answer is "+ a);
            } else if (output.equalsIgnoreCase("random")) {
                double r = Math.random();
                System.out.println("The answer is "+ r);
            }
    }

    static void Menu(){
        System.out.println("Math Class Menu");
        Space();
        Line();
        Space();
        System.out.println("Pow");
        System.out.println("Round (2nd)");
        System.out.println("Min");
        System.out.println("Max");
        System.out.println("Ceil (1st)");
        System.out.println("Floor (2nd)");
        System.out.println("Abs (1st)");
        System.out.println("Random");
    }

    static void Line(){
        System.out.println("-----------------------");
    }

    static void Space(){
        System.out.println(" ");
    }


}