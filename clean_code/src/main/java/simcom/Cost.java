package simcom;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;
public class Cost{

static BufferedWriter bw=new BufferedWriter(new OutputStreamWriter(System.out));
static Scanner br=new Scanner(System.in);
static
{
try
{
bw.write("enter the area in square feet:");
bw.flush();
float area=br.nextFloat();
bw.write("\n enter\n1.standard material\n 2.high quality material \n enter the no:");
bw.flush();
int ch1=br.nextInt();
bw.write("\n enter \n1.simple house\n 2.automated house\n enter the no:");
bw.flush();
int ch2=br.nextInt();
if(ch1==1&&ch2==1)
{
area=area*1500;
bw.write("\n estimated cost for simple house with standard material"+"is"+" "+area+"INR");
}
else if(ch1==1&&ch2==2)
{
area=area*1500;
bw.write("\n estimated cost for automated house with standard material"+"is"+" "+area+"INR");
}
else if(ch1==2&&ch2==1)
{
area=area*1800;
bw.write("\n estimated cost for simple house with high quality material"+"is"+" "+area+"INR");
}
else if(ch1==2&&ch2==2)
{
area=area*2500;
bw.write("\n estimated cost for automated house with high quality material"+"is"+" "+area+"INR");
}
else
{
bw.write("invalid option");
}
bw.close();
br.close();
}
catch(IOException ex)
{
}
System.exit(0);
}
}