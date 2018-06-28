package Bridgelabz1;
import com.bridgelabz.Utility.*;
public class PrimeNumber
{
  public static void main(String []args)
  {
	  System.out.println("Enter the number");
	  int n=Utility.input();
	  boolean rs =Utility.prime(n);
	  if(rs)
		  System.out.println("prime number "+n);
	  else
		  System.out.println("Not prime number "+n);
	  
  }
}
