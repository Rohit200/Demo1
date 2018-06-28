package com.bridgelabz.Utility;
import java.util.*;
//import Bridgelabz1.*;
import java.util.Scanner;
public class Utility
{
	
	 public static void leap(int n)
	 {
	 			if(n%100==0 && n%400==0)
	 				System.out.println("leap year");
	 			else if(n%4==0 && n%100!=0)
	 				System.out.println("leap year");
	 			else 
	 				System.out.println("Not leap year");
	 }
	 public static int count(int n)
	 {
		 int c=0;
		 while(n>0)
		 {
			 c++;
			 n=n/10;
		 }
		 return c;
	 }
	 public static int input()
	 {
		 Scanner sc=new Scanner(System.in);
		 int n=sc.nextInt();
	      return n;
	 }
	 public static void flip(int n)

	 {
		 int head =0;
		 int tail=0;
		 if(n>0)
		  {
			  for(int i=1;i<=n;i++)
			  {
				  double d=Math.random();
				  if(d>0.5)
					  head++;
				  else
					  tail++;
			  }
				  
		  }
		  if(n>0)
		  {
			 System.out.println("Number of times tail comes "+tail);
			 System.out.println("Number of times head comes "+head); 
			}
		  else
			  System.out.println("please flip a coin atleast one time"); 
		}
	 public static void coupon(int n)
	 {
		 int a[]=new int[n];
		 int c=0;
		  for(int i=0;i<n;i++)
		  {
			  double d= Math.random();
			  c=(int)(100*d);
			  int j;
			  for( j=0;j<=i;j++)
			  {
				  if(i==0)
					  a[i]=c;
				  else
				  {
					  if(a[j]!=c)
						  continue;
					  else
						  break;
				  }
				  }
			  if(j>i&&i!=0)
				  a[i]=c;
			  else if(a[j]==c && j<=i)
			  i--;
			  else
				  continue;
		        
		  }
		  for(int k=0;k<a.length;k++)
		  {
			  System.out.print(a[k]+" ");
		  }
			}
     public static void powerof2(int n)
     {
    	 if(n<31)
   	  {
   		  int sum =1;
   		  for(int i=1;i<=n;i++)
   		  {
   			  sum=sum*2;
   			  System.out.println("2"+"^" +i+ "=" + sum);
   			  }
   		  }
   	  else
   		  System.out.println("Enter the number less than 31");
   	  }
     public static boolean prime(int n)
     {
    			int i;
    			for( i=2;i<=n/2;i++)
    			{
    				if(n%i!=0)
    					continue;
    				else
    					break;
    				}
    			if(n==1||n<=0)
    				return false;
    			else if(i>n/2||n==2)
    				return true;
    			else
    				return false;
     }
		   public static void gambler()
		   {
			    double win=0;
			     double loss=0;
			     int stack;
			     int trails;
			     int goals;
			     System.out.println("How many trails");
			     trails =Utility.input();
			     System.out.println("How many Stack");
			 	 stack =Utility.input();
			 	 System.out.println("What is yout goals");
			     goals= Utility.input();
			     int i=1;
					   while(i<=trails && stack>0 && stack <=goals)
			   {
				  double d=Math.random();
				  if(d<0.5)
				  {
					loss++;
				  stack--;
				  }
				  else
				  {
					  win++;
					  stack--;
				  }
				  i++;
			   }
			   System.out.println("the winning chance is "+ win/trails);
		System.out.println("the lossing chance is "+ loss/trails);
			   
		   }
	 }



		

