package Q5;

public class CmdOption 
{
	public static void main(String[] args)
	{
		int x=Integer.parseInt(args[0]);
		switch(x)
		{
			case 1:
				for(int i=2;i<=100;i+=2)
				{
					//for(int j=1;j<=10;j++)
					//{
						System.out.print(" "+i);
					//}
					//System.out.println();
				}
				break;
			case 2:
				System.out.println("Twinkle Twinkle.........");
				break;
			case 3:
				System.out.println("Welcome To Core Java");
				break;
			default: 
				System.out.println("Incorrect Option");
		}
	}
}