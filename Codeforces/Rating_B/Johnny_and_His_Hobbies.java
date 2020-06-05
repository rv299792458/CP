import java.util.*;
import java.lang.*;
import java.io.*;
public class Johnny_and_His_Hobbies
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
     TreeSet<Integer>set1=new TreeSet<>();
      for(int i=0;i<n;++i)
      {
        set1.add(Integer.parseInt(s[i]));
      }
      int max=set1.last()*2;
      int ans=0;

      boolean flag=false;
      for(int i=1;i<=max;++i) {
        Iterator it=set1.iterator();
        TreeSet<Integer> set2 = new TreeSet<>();
        while (it.hasNext()) {

          set2.add((Integer) ((int)it.next()^i));
        }
       // out.print(set1+"   "+set2);
        if(set1.equals(set2))
        {
          out.println(i);
          flag=true;
          break;
        }
      }
      if(!flag)
        out.println(-1);



    }
    out.close();



  }
}