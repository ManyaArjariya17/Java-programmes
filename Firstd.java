import java.util.*;

public class Firstd {
	public static void main(String[] args) 
	{
		int n, first_digit, last_digit;
		Scanner Sc = new Scanner(System.in);
		
		System.out.print("  enter a number : ");
		n = Sc.nextInt();	
		
		first_digit = n;
		while(first_digit >= 10)
		{
			first_digit = first_digit / 10;
		}	
		
		last_digit = n % 10;
		
		System.out.println(" The First Digit of a Given Number " + n + "  =  " + first_digit);
		System.out.println(" The Last Digit of a Given Number " + n + "  =  " + last_digit);
	}
}

// Name - Manya Arjariya
// Roll-NO. - 36
// Section  - G