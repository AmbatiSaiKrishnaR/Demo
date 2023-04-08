import java.util.Scanner;
class PerfectNo

{
	public static void main(String [] args){
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the number");
	int num=scn.nextInt();
	int sum=0;
	for(int i=1;i<num;i++){
	if(num%i==0)
	 sum=sum+i;
}
	if(sum==num)
	System.out.println("its a perfect number");
	else
	System.out.println("its is not a perfect number");
}
}