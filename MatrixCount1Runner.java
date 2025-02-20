//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.Scanner;

public class MatrixCount1Runner
{
	public static void main( String args[] ) throws Exception
	{
		Scanner kb = new Scanner(System.in);
		System.out.println("Number what it is ");
		int val = kb.nextInt();

		System.out.println((val + " Count: ")+MatrixCount1.count(val));
	}
}


