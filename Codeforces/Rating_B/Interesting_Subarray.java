import java.util.*;
import java.lang.*;
import java.io.*;
public class Interesting_Subarray
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

  public static void main (String[] args) throws java.lang.Exception
  {
    FastReader sc=new FastReader();
    int t=sc.nextInt();
    for (int t1=0;t1<t;++t1)
    {
      int n=sc.nextInt();
      String s[]=sc.nextLine().split(" ");
      long arr[]=new long[n];
      for(int i=0;i<n;++i)
      {
        arr[i]=Long.parseLong(s[i]);
      }
      boolean ans=false;

      for(int i=0;i<n-1;++i)
      {
        if(Math.abs(arr[i]-arr[i+1])>1)
        {
          ans=true;
          out.println("YES");
          out.println((i+1)+" "+(i+2));
          break;
        }
      }
      if(!ans)
        out.println("NO");



    }
    out.close();



  }
}