import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        Scanner Sc = new Scanner(System.in);
		System.out.print("Enter the value n : ");
		int n = Sc.nextInt();
        long factorial = 1;
        for(int i = 1; i <= n; ++i)
        {
           
            factorial *= i;
        }
        System.out.printf("Factorial of %d = %d", n, factorial);
    }
}

// Name - Manya Arjariya
// Roll-NO. - 36
//Section  - G