//(c) A+ Computer Science
//www.apluscompsci.com
//Name -

import java.util.*;

public class TotalRow
{
    public static List<Integer> getRowTotals( int[][] m )
    {
      
      ArrayList<Integer> tot;
      tot = new ArrayList<Integer>();
    	for (int[] row : m ) 
      {
        int sum = 0;
        for ( int num: row)
        {
          sum+= num;
        }
          tot.add(sum);
      }

		return tot;
    }
    
}
