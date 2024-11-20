public class ACT4{
    public static void main(String[]args){
	
	    int nm1=5;
		int nm2=10;
		int nm3=15;
		int nm4=20;
	    int sum= nm1 + nm2 + nm3 + nm4;
		int sub= nm2 - nm3 - nm4 - nm1;
		int pro= nm1 * nm2 * nm3 * nm4;
		int dvd= nm4 / nm3 / nm2 / nm1;
		int average= (nm2 + nm3 + nm4 + nm1) / 4;
		
	System.out.println("The sum of " + nm1 + ", " + nm2 + ", " + nm3 + ", " + nm4 + " is " + sum);
	System.out.println(nm2 + " - " + nm3 + " - " + nm4 + " - " + nm1 + " is " + sub);
	System.out.println("The product of " + nm1 + ", " + nm2 + ", " + nm3 + ", " + nm4 + " is " + pro);
	System.out.println(nm4 + " / " + nm3 + " / " + nm2 + " / " + nm1 + " = " + dvd);
	System.out.println("The average of " + nm2 + ", " + nm3 + ", " + nm4 + ", " + nm1 + " is " + average);

	
    }
}