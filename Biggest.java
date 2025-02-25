//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

public class Biggest
{
    public static int getBig(int[][] m)
    {
      int big = m[0][0];
		 for ( int [] row : m)
     {
        for ( int col : row)
        {
            if ( col > big )
            {
              big = col;
            }
        }
     }
     
      return big;
    }
}
