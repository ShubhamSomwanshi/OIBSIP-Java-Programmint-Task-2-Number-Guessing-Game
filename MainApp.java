package com.shubhscode.demos;

public class MainApp 
{

	public static void main(String[] args) 
	{
		System.out.println("\n\t\t\t\t\t\t**********");
		System.out.println("\n\t\t\t\t\tWelcome to Number Guessing Game");
		System.out.println("\n\t\t\t\t\t\t**********");
		Game ga = new Game();
		boolean b=false;
		while(!b)
		{
			ga.takeInput();
			b = ga.isCorrect();
		}
			
	}

}
