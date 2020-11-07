import java.util.*;
import java.lang.*;
import java.io.*;
public class Beautiful_Numbers
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
    for (int t1=0;t1<t;++t1)
    {
      int n=sc.nextInt();
      String s[]=sc.nextLine().split(" ");
      int arr[][]=new int[n][2];
      for(int i=0;i<n;++i)
    {
      arr[i][0]=Integer.parseInt(s[i]);
      arr[i][1]=i;
    }
      sortbyCol(arr,0);
//      for(int i=0;i<n;++i)
//      {
//        out.println(arr[i][0]+" "+arr[i][1]);
//      }
      int min=arr[0][1];
      int max=arr[0][1];
      for(int i=0;i<n;++i) {

        if(min>arr[i][1])
          min=arr[i][1];
        if(max<arr[i][1])
          max=arr[i][1];
        if (max - min + 1 == arr[i][0])
          out.print(1);
        else
          out.print(0);

      }
      out.println();

      }
    out.close();

    }



  }
