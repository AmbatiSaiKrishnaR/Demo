import java.util.Scanner;
class palindrome

{
	public static void main(String [] args)
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number");
	int n=scn.nextInt();
	int t=0;
	int reverse=0;
while(t!=0)
 	{
	int num=t%10;
	reverse=(reverse*10)+reverse;
	t=t/10;
	}
	if(reverse==n)
	{
	System.out.println("its is a palindrome number");
	}
	else
	{
	System.out.println("its is not a palindrome number");
	}
}
}	
	

	