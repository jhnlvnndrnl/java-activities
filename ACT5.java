import java.util.*;
	public class ACT5{
		public static void main(String[]args){
			Scanner scn = new Scanner(System.in);
		
		System.out.println("Menu");
		System.out.println("------------------");
		System.out.println("1-Addition");
		System.out.println("2-Subtraction");
		System.out.println("3-Mutiplication");
		System.out.println("4-Division");
		System.out.println("5-Modulus");
		System.out.println("6-Average");
		System.out.println("------------------");
		System.out.println("Enter Operation: ");
		int num1 = scn.nextInt();
		System.out.println("Enter First numer: ");
		int num2 = scn.nextInt();
		System.out.println("Enter Second number: ");
		int num3 = scn.nextInt();
		System.out.println("Enter Third number: ");
		int num4 = scn.nextInt();
		System.out.println("------------------");
		
		
		if (num1==1){
			System.out.println("The Answer is " + (num2 + num3 + num4));
		}else if (num1==2){
			System.out.println("The Answer is " + (num2 - num3 - num4));
		}else if (num1==3){
			System.out.println("The Answer is " + (num2 * num3 * num4));
		}else if (num1==4){
			System.out.println("The Answer is " + (num2 / num3 / num4));
		}else if (num1==5){
			System.out.println("The Answer is " + (num2 % num3 % num4));
		}else if (num1==6){
			System.out.println("The Answer is " + ((num2 + num3 + num4) / 3));
		}
		
		
	}
}
	