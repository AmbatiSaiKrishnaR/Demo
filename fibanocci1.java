import java.util.*;
class Fibanocci1

{
	public static void main(String [] args)
	{
	Scanner scn=new Scanner(System.in);
	System.out.println("Enter the Range");
	int m=scn.nextInt();
	int n=scn.nextInt();
	int a=0,b=1,c;
	
	while(a<=n){	
	
	c=a+b;
	a=b;
	b=c;
	if(a>=m)System.out.print(a+" ");
	}
	
}


}

