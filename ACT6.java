import java.util.*;
public class ACT6{

	public static void main(String[]args){
		Scanner scn = new Scanner(System.in);
		
		System.out.print("Enter Sentence: ");
		String Name = scn.nextLine();
		
			int Len = Name.length(); 
		
		System.out.println("Menu");
		System.out.println("============");
		System.out.println("First Letter");
		System.out.println("Second Letter");
		System.out.println("Second2 Letter");
		System.out.println("Last Letter");
		System.out.println("============");
		
		System.out.print("choose output: ");
		String Name2 = scn.nextLine();
		
	
		
		if(Name2.equalsIgnoreCase("First")){
			System.out.print("The First Letter is ");
			System.out.println(Name.charAt(0));
		} else 	if(Name2.equalsIgnoreCase("Second")){
			System.out.print("The Second Letter is ");
			System.out.println(Name.charAt(1));
		} else 	if(Name2.equalsIgnoreCase("Second2")){
			System.out.print("The Second to the last Letter is ");
			System.out.println(Name.charAt(Len-2));
		} else 	if(Name2.equalsIgnoreCase("Last")){
			System.out.print("The Last Letter is ");
			System.out.println(Name.charAt(Len-1));
		}
	}
}