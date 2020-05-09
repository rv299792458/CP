import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Queue;

public class Same_Parity_Summands {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t)
    {
      StringBuilder ans=new StringBuilder();
      String s[]=br.readLine().trim().split(" ");
      long n=Long.parseLong(s[0]);
      int k= Integer.parseInt(s[1]);
      if(k>n||(n%2!=0&&k%2==0))
      {
        System.out.println("NO");
        continue;
      }
      if(n%k==0)
      {
        System.out.println("YES");
        for(int i=0;i<k;++i)
        {
          System.out.print(n/k+" ");
        }
        System.out.println();
        continue;
      }
      if(n%2==0&&k%2!=0)
      {
        long sum=0;
        for(int i=0;i<k-1;++i)
        {
          ans.append(2+" ");
        }
        sum=n-(k-1)*2;
        if(sum<=0||sum%2!=0)
        {
          System.out.println("NO");
          continue;
        }
        else
        {
          System.out.println("YES");
          ans.append(sum);
          System.out.println(ans.toString());
        }

      }
      if((n%2==0&&k%2==0)||(n%2!=0&&k%2!=0))
      {
        long sum=0;
        for(int i=0;i<k-1;++i)
        {
          ans.append(1+" ");
        }
        sum=n-k+1;
        if(sum<=0||sum%2==0)
        {
          System.out.println("NO");
          continue;
        }
        ans.append(sum);
        System.out.println("YES");
        System.out.println(ans.toString());
      }

    }
  }
}
