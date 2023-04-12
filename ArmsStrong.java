import java.util.Scanner;
class ArmsStrong

{
	public static void main(String [] args)
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=scn.nextInt();
	int temp=num;
	int temp1=num;
	int count=0;
	int sum=0;
	int result=0;
	while(temp>0){
		temp=temp/10;
		count++;
}
	while(temp1>0){
	int rem =temp1%10;
	result = (int)(result+Math.pow(rem,count));
/*
	int mul=1;

	for(int i=1;i<=count;i++){
	mul=mul*rem;
	}

	
	sum=sum+mul;
*/
	//sum = sum+result;
	temp1=temp1/10;
	}
	if (result==num)
	System.out.println("ArmsStrong No");
	else
	System.out.println("Not a ArmsStrong No");
	
	
}

}