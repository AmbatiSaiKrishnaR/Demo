import java.util.*;
class Harshad

{
	public static void main(String [] args)
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Number");
	int n=scn.nextInt();
	int temp=n;
	int sum=0;

	while(temp>0){
	 	int rem=temp%10;
	System.out.println("remainder"+rem);
		sum=sum+rem;	
	System.out.println("sum"+sum);
		temp=temp/10;
	System.out.println("temp"+temp);
	System.out.println("****************************");
 	}
	if(n%sum==0)
	System.out.println("Harshad No");
	else
	System.out.println("Not a Harshad No");
}
}