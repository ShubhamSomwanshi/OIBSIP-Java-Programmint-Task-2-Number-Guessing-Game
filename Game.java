package com.shubhscode.demos;

import java.util.Random;
import java.util.Scanner;

public class Game 
{
	int num;
	int inputnum;
	int numberOfGuesse=0;
	
	Game()
	{
		Random rad = new Random();
		num = rad.nextInt(100);
	}
	
	
	public int getNumberOfGuesse() 
	{
		return numberOfGuesse;
	}
	
	public void setNumberOfGuesse(int numberOfGuesse) 
	{
		this.numberOfGuesse = numberOfGuesse;
	}
	
	
	public void takeInput()
	{
		System.out.println("Guess the number");
		Scanner sc = new Scanner(System.in);
		inputnum=sc.nextInt();
//		return inputnum;
	}
	
	
	boolean  isCorrect()
	{
		numberOfGuesse++;
		if(inputnum == num)
		{
			System.out.println("\n\t\t\t\t\t\t**********");
			System.out.println("\n\t\t\t\t\t\tCorrect guess.\n\t\t\t\t\t\tThe actual number is:"+num);
			System.out.println("\n\t\t\t\t\t\tYour attempts is: "+numberOfGuesse);
			System.out.println("\n\t\t\t\t\t\t**********");
			return true;
			
		}
		else if(inputnum<num)
		{
			System.out.println("To minumun than actal number");
		}
		else if(inputnum>num)
		{
			System.out.println("To maximum than actial number");
		}
		return false;
	}
}
