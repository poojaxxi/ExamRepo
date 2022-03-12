package Q4;

public class CmdLength_Upper {

	public static void main(String[] args) {
		for(int i=0;i<args.length;i++)
		{
			System.out.println(args[i].toUpperCase()+" Length of String is: "+args[i].length());	
		}	
	}
}

