package com.pm.arraysprograms;

public class Prgrm2 
{
public static void test(int n[])
{
	int b []=new int [n.length];
	for(int i=0;i<b.length;i++)
	{
	    b[i]=n[i];
	    System.out.print(b[i]+" ");
	}
}
public static void main(String[] args) 
{
	int a []= {1,2,3,4,5,6,7,8};
	test(a);
}
}
