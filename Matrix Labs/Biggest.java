//(c) A+ Computer Science
//www.apluscompsci.com
//Name - paschal

public class Biggest
{
    public static int getBig(int[][] m)
    {
      int big = m[0][0];
      for(int i = 0; i < m.length; i ++){
        for(int j = 0; j < m[i].length; j++){
          if(m[i][j] > big){
            big = m[i][j];
          }
        }
      }
      return big;
    }
}
