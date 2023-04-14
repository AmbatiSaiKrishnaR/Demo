import java.util.Scanner;
class Automarphic
{
	public static void main(String [] args)
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Number");
	int num =scn.nextInt();
	int temp=num;
	int count=0;
	int result=0;
	if(temp<0){
		System.out.println("NO NEGATIVE PLEASE.......");
		}
	else
		{
	int sqrnum=(int)Math.pow(temp,2);
	System.out.println(sqrnum);
	
	while(temp>0){
	temp=temp/10;
	count++;
	}

	result=sqrnum%(int)Math.pow(10,count);
	
	if(num==result)
	System.out.println("Automarphic number");
	else
	System.out.println("Not a Automarphic");
}
   }
}
	
