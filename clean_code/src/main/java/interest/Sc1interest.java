package interest;

public class Sc1interest {
	static double p,r,t,si,ci;
 public static double simpleinterest()
 {
	 si=(p*r*t)/100;
	 return si;
 }
 
  public static double compoundinterset()
 {
	 ci=p*Math.pow(1+r/100,t)-p;
	 return ci;
 }
}