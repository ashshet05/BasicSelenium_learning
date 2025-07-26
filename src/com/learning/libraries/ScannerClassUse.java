package com.learning.libraries;
import java.util.Scanner;

public class ScannerClassUse 
{

	public static void main(String[] args) 
	{
		System.out.println("Input the data required");
		Scanner ref=new Scanner(System.in);
		String str=ref.nextLine();
		System.out.println("String="+str);
		
	}

}