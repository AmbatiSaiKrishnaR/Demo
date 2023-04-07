import java.util.Scanner;
class DecToBin
{
	public static void main(String []args)
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Decimal Number");
	int d=scn.nextInt();
	int b=0;
	int i=1;
	while(d>0){
		int bit=d%2;
		b=(bit*i)+b;
		d=d/2;
		i=i*10;
	}
	System.out.println(b);
}
}