import java.util.*;
public class ACT8{
	public static void main(String[]args){
	Scanner scn = new Scanner(System.in);
	
	String w;
	int n;
	int x;
		do{
			System.out.print("Enter Word: ");
			w = scn.nextLine();
			n = w.length();
			
			for(x=0; x<n; x++){
			System.out.println(w);
			}
				
		}while(n!=1);

	}
}