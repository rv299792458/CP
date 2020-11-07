
import java.util.*;
import java.lang.*;
import java.io.*;
public class Trouble_sort
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
      int n=sc.nextInt();
      String s[]=sc.nextLine().trim().split(" ");
      String type[]=sc.nextLine().trim().split(" ");
      boolean isSorted=true;
      boolean zero=false,one=false;
      int a=Integer.parseInt(s[0]);
      for(int i=1;i<n;++i)
      {
        int b=Integer.parseInt(s[i]);
        if(a>b) {
          isSorted = false;
          break;
        }
        a=b;

      }

      for(int i=0;i<n;++i)
      {
        if(Integer.parseInt(type[i])==0)
          zero=true;
        if(Integer.parseInt(type[i])==1)
          one=true;
        if(one && zero)
          break;
      }
      if(isSorted)
      {
        out.println("Yes");
        continue;
      }
      else
      {
        if(one && zero)
        {
          out.println("Yes");
          continue;
        }
        else
        {
          out.println("No");
        }


      }


    }

    out.close();


  }



}
