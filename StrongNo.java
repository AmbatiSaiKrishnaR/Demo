import java.util.Scanner;
class StrongNo

{
	public static void main(String [] args)
{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter a Number");
	int num=scn.nextInt();
	int temp = num;
	int digit=0;
	int sum=0;
	int mul=1;
	while(temp>0){
  		digit=temp%10;
		mul=1;
	for(int i=1;i<=digit;i++){
		mul=mul*i;
	}
 		sum=sum+mul;
		temp=temp/10;
	}
 	if(sum==num)
		System.out.println(num+" It is a Strong Number");
		else
		System.out.println(num+" It is not a Strong Number");
	

}
}