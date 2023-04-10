import java.util.Scanner;
class FibUsingRecurssion
{
	
	public static int F(int n)
	{
	if(n==1) return 0;
	if(n==2) return 1;
	F=F(n-1)+F(n-2);
	System.out.println(F);
	}
}