
import java.util.*;
import java.lang.*;
import java.io.*;
public class Dominated_Subarray
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
      if(n==1)
      {
        out.println("-1");
        continue;
      }
     HashMap<Integer,Integer>hm=new HashMap<>();
      boolean ansPrinted=false;
     int  minans=Integer.MAX_VALUE;
     for(int i=0;i<n;++i)
     {
      int ele=Integer.parseInt(s[i]);
      if(hm.get(ele)==null)
        hm.put(ele,i);
      else
      {
       if(minans>(i-hm.get(ele)+1))
         minans=i-hm.get(ele)+1;
       hm.put(ele,i);
        ansPrinted=true;

      }

     }
     if(!ansPrinted)
       out.println(-1);
     else
       out.println(minans);

    }

    out.close();


  }



}
