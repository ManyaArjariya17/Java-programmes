import java.util.*;

public class Palindrome{  
 public static void main(String args[]){  
  int r,sum=0,temp;  
  Scanner Sc = new Scanner(System.in); 
  System.out.print("Enter the value a : "); 
  int a = Sc.nextInt();
  temp=a;    
  while(a>0){    
   r=a%10;  //getting remainder  
   sum=(sum*10)+r;    
   a=a/10;    
  }    
  if(temp==sum)    
   System.out.println("palindrome number ");    
  else    
   System.out.println("not palindrome");    
}  
}  

// Name - Manya Arjariya
// Roll-NO. - 36
// Section - G