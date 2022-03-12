package Q2;

public class TestWrapperClass {

	public static void main(String[] args) 
	{
		System.out.println("");
		Integer x=33;
		System.out.println(x);
		increment(x);
		System.out.println(x);
		
		System.out.println("Using MyWrapper Class");
		MyWrapper y=new MyWrapper();
		y.value=33;
		System.out.println(y.value);
		increment(y);
		System.out.println(y.value);
	}
	public static void increment(Integer x)
	{
		x++;	//boxing + autoboxing
	}
	public static void increment(MyWrapper y)
	{
		y.value=y.value + 1;
	}
}
class MyWrapper
{
	int value;
}
