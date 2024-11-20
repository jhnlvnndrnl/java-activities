import java.util.*;
public class ACT7{
    public static void main(String[]args){
        Scanner scn = new Scanner(System.in);

        System.out.print("Enter First Number: ");
        int a = scn.nextInt();

        System.out.print("Enter Last Number: ");
        int b = scn.nextInt();

        int c;
        for (c = a; c<=b; c++){
            System.out.println(c);
        } //for lowest to highest//

        int d;
        for (d = a; d>=b; d--){
            System.out.println(d);
        } //for highest to lowest//
    }
}