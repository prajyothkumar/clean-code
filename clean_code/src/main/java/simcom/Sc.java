package simcom;

import  interest.*;

import java.io.IOException;
import java.io.PrintStream;
import java.util.Scanner;

public class Sc {

	private static double si ;
	private static double ci;

	@SuppressWarnings({ "resource", "unused", "static-access" })
	public static void main(String args[]) throws IOException 
	{
		Sc1interest i=new Sc1interest();
		Scanner s=new Scanner(System.in);
		System.out.write("enter the amount:\n".getBytes());
		double p = s.nextDouble();
		System.out.write("enter the no.of years:\n".getBytes());
		double t=s.nextDouble();
		System.out.write("enter the rate of interest:\n".getBytes());
		double r=s.nextDouble();
		i.simpleinterest();
		PrintStream stream=new PrintStream(System.out);
		stream.print(si);
		//stream.flush();
		Sc1interest.compoundinterset();
		PrintStream stream1=new PrintStream(System.out);
		stream1.print(ci);
		//stream.flush();
		
	}

}
