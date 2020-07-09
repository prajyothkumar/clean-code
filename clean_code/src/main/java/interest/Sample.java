package interest;

import java.io.FileDescriptor;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.Scanner;
@SuppressWarnings("resource")
public class Sample {
	static{
		float pValue,rValue,tValue,nValue=12;
		Scanner scanner =new Scanner(System.in);
		PrintStream printstream=new PrintStream(new FileOutputStream(FileDescriptor.out));
		printstream.print("Enter the principal:");
		pValue=scanner.nextFloat();
		printstream.print("Enter the Rate Of interest:");
		rValue=scanner.nextFloat();
		printstream.print("Enter the time period:");
		tValue=scanner.nextFloat();
		float simpleInterest=(rValue*tValue*pValue)/100;
		printstream.print("The Simple Interest is:"+simpleInterest+"\n");
		printstream.print("Enter nValue number of times that interest is compounded per unit tValue:");
		nValue=scanner.nextInt();
		double amount=pValue*Math.pow(1+(rValue/nValue),nValue*tValue);
		double cInterest=amount-pValue;
		printstream.print("Compound Interest after"+tValue+"years:"+cInterest);
		printstream.print("Amount after"+tValue+"years:"+amount);
		System.exit(0);
		}


}
