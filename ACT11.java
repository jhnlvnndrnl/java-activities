import java.util.*;
public class ACT11{

	static void Space(){
		System.out.println(" ");
	}
	
	public static void main (String[]args){
	Scanner scn = new Scanner(System.in);
	
	
	System.out.print("Enter # of inputs: ");
	int input = scn.nextInt();
	Space();
		
	int [] a = new int[input];
	
		int v = 0;
		int x = 0;
		for (x=0; x<input; x++){
			System.out.print("Enter Number: ");
			a [v] = scn.nextInt();
			v++;
		}
		
		Space();
		int y = 0;	
		for (y=0; y<input; y++){
			System.out.print(a[y] + ", ");
		}
		
	}
}