import java.util.Scanner;
public class ACT9{
	public static void main(String[]args){
	Scanner scn = new Scanner(System.in);
		
	System.out.print("Enter Name: ");
	String name = scn.nextLine();
	
	System.out.print("Enter Section: ");
	String section = scn.nextLine();
	
	System.out.println(" ");
	
	
	
	while(true){
		System.out.println("(Add) Addition");
        System.out.println("(Sub) Subtraction");
        System.out.println("(Mul) Multiplication");
        System.out.println("(Div) Divison");
        System.out.println("(Ave) Average");
		
		System.out.println(" ");
		
		System.out.print("Enter Operation: ");
		String op = scn.next();
	
		System.out.print("Enter First Number: ");
		int fnum = scn.nextInt();
		
		System.out.print("Enter Second Number: ");
		int snum = scn.nextInt();
		
		System.out.print("Enter Third Number: ");
		int tnum = scn.nextInt();
		
		
			if(op.equalsIgnoreCase("add")){
				System.out.println(" ");
				System.out.println("Name: " + name);
				System.out.println("Section: " + section);
				System.out.print("The sum of " + fnum + ", " + snum + " & " + tnum + "  is ");
				System.out.println(fnum + snum + tnum);
				System.out.println(" ");
				
				
			} else if (op.equalsIgnoreCase("sub")){
				System.out.println(" ");
				System.out.println("Name: " + name);
				System.out.println("Section: " + section);
				System.out.print(fnum + " - " + snum + " - " + tnum + " - " + " is ");
				System.out.println(fnum - snum - tnum);
				System.out.println(" ");
				
			} else if (op.equalsIgnoreCase("mul")){
				System.out.println(" ");
				System.out.println("Name: " + name);
				System.out.println("Section: " + section);
				System.out.print("The product of " + fnum + ", " + snum + " & " + tnum + "  is ");
				System.out.println(fnum * snum * tnum);
				System.out.println(" ");
				
			} else if (op.equalsIgnoreCase("div")){
				System.out.println(" ");
				System.out.println("Name: " + name);
				System.out.println("Section: " + section);
				System.out.print(fnum + " / " + snum + " / " + tnum + " / " + " is ");
				System.out.println(fnum / snum / tnum);
				System.out.println(" ");
				
			} else if (op.equalsIgnoreCase("ave")){
				System.out.println(" ");
				System.out.println("Name: " + name);
				System.out.println("Section: " + section);
				System.out.print("The average of " + fnum + ", " + snum + " & " + tnum + "  is ");
				System.out.println((fnum + snum + tnum)/3);
				System.out.println(" ");
			} else {
			break;
			}
		}		
	}
}