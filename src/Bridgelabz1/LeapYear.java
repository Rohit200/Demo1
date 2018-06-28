package Bridgelabz1;
import com.bridgelabz.Utility.*;
public class LeapYear
{
	public static void main(String []args)
	{
		System.out.println("Enter the number");
		int m=Utility.input();
		int n=Utility.count(m);
		System.out.println(n);
		if(n>=4)
		{
		Utility.leap(n);
		}
		else
			System.out.println("Year has not four digit");	
}

}
