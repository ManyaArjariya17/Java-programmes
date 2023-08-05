
import java.util.Scanner;
public class Reverse 
{
    public static void main(String args[])
    {
        int m, n, sum = 0;
        Scanner Sc = new Scanner(System.in);
        System.out.print("enter the number:");
        m = Sc.nextInt();
        while(m > 0)
        {
            n = m % 10;
            sum = sum * 10 + n;
            m = m / 10;
        }
        System.out.println("reverse of the number is "+sum);
    }
}

// Name - Manya Arjariya
// Roll-NO. - 36
// Section  - G