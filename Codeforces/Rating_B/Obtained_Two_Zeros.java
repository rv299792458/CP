
import java.util.*;
import java.lang.*;
import java.io.*;
public class Obtained_Two_Zeros
{

  public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
  static class FastReader
  {

    BufferedReader br;
    StringTokenizer st;

    public FastReader()
    {
      br = new BufferedReader(new
          InputStreamReader(System.in));
    }

    String next()
    {
      while (st == null || !st.hasMoreElements())
      {
        try
        {
          st = new StringTokenizer(br.readLine());
        }
        catch (IOException  e)
        {
          e.printStackTrace();
        }
      }
      return st.nextToken();
    }

    int nextInt()
    {
      return Integer.parseInt(next());
    }

    long nextLong()
    {
      return Long.parseLong(next());
    }

    double nextDouble()
    {
      return Double.parseDouble(next());
    }

    String nextLine()
    {
      String str = "";
      try
      {
        str = br.readLine();
      }
      catch (IOException e)
      {
        e.printStackTrace();
      }
      return str;
    }
  }
  static int MOD=1000000000+7;
  public static void sortbyCol(int arr[][],int col)
  {
    Arrays.sort(arr,new Comparator<int[]>(){
      @Override
      public int compare(int[] o1, int[] o2) {
        // To sort in descending order revert
        // the '>' Operator
        if(o1[col]>o2[col])
          return 1;
        else
          return -1;
      }
    });
  }

  public static void main (String[] args) throws java.lang.Exception
  {
    FastReader sc=new FastReader();
    int t=sc.nextInt();
    for(int t1=0;t1<t;++t1)
    {
      String s[]=sc.nextLine().trim().split(" ");
      long a=Long.parseLong(s[0]);
      long b=Long.parseLong(s[1]);
      long min=Math.min(a,b);
      long max=Math.max(a,b);
      if(max<=min*2 && (a+b)%3==0)
      {

          out.println("Yes");

      }
      else
        out.println("No");


    }

    out.close();


  }



}
