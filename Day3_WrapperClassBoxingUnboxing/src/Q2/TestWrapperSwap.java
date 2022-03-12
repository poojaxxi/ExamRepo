package Q2;

import java.util.Scanner;

public class TestWrapperSwap {

	public static void main(String[] args) {
		/*Scanner sc=new Scanner(System.in);
		System.out.println("Enter Num1: ");
		Integer x=sc.nextInt();
		System.out.println("Enter Num2: ");
		Integer y=sc.nextInt();
		System.out.println("Before swap: x:"+x+" y:"+y);
		swap(x,y);
		System.out.println("After swap: x:"+x+" y:"+y);*/
		
		
		//System.out.println("Enter Num1: ");
		MyWrapperSwap x=new MyWrapperSwap();
		x.value1=23;
		//System.out.println("Enter Num2: ");
		MyWrapperSwap y=new MyWrapperSwap();
		y.value2=21;
		System.out.println("Before swap: x:"+x.value1+" y:"+y.value2);
		swap(x,y);
		System.out.println("After swap: x:"+x.value1+" y:"+y.value2);
	}
	
	
	/*public static void swap(Integer p,Integer q)
	{
		int tmp=p;
		p=q;
		q=tmp;
	}*/
	
	
	public static void swap(MyWrapperSwap p,MyWrapperSwap q)
	{
		int tmp;
		tmp=p.value1;
		p.value1=q.value2;
		q.value2=tmp;
	}
}
class MyWrapperSwap
{
	int value1;
	int value2;
}
