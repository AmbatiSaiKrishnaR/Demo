,,,,,,,,,,,,,,,,,,,,,,,,,,,,,import java.util.Scanner;
class BinToDec

{
	public static void main (String [] args)
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Binary");
	int bin=scn.nextInt();
	int d=0;
	int i=1;
 	while(bin>0){
		int val=bin%10;
		d=(val*i)+d;
		i=i*2;
		bin=bin/10;
	}
		System.out.println(d);
	}
}