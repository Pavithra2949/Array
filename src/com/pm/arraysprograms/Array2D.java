package com.pm.arraysprograms;

public class Array2D 
{
   public static int sum(int num[][])
   {
	   int sum=0;
	   for(int i=0;i<=num.length-1;i++)
	   {
		   for(int j=0;j<=num[i].length-1;j++)
		   {
			   sum = sum+num[i][j];
		   }
	   }
	   return sum;
   }
   public static int leftsumdia(int num[][])
   {
	   int sum=0;
	   for(int i=0;i<num.length;i++)
	   {
		   for(int j=0;j<num[i].length;j++)
		   {
			   if(num[i]==num[j])
			   {
				   sum = sum+num[i][j];
			   }
		   }
	   }
	   return sum;
   }
   public static void main(String[] args) 
   {
	   int[][]input= {{1,2,3},{3,4,6},{1,2,6}};
	   sum(input);
	   leftsumdia(input);
	   System.out.println( "Sum of given ARRAY --> "+ sum(input));
	   System.out.println( "Sum of leftsumdia ARRAY --> "+ leftsumdia(input));
   }
}
