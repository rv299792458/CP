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

public class Alternating_Subsequence {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t)
    {
    int n=Integer.parseInt(br.readLine());
    String s[]=br.readLine().trim().split(" ");
      long maxp=0;
      long maxn=Long.MAX_VALUE;
    long sum=0;
    for(String d:s)
    {
      long a=Long.parseLong(d);
      if(a>0)
      {
        if(maxn!=Long.MAX_VALUE) {
          sum += maxn;
          maxn = Long.MAX_VALUE;
        }
        if(maxp<a)
        {   maxp=a;
         // System.out.println("1");
        }
      }
      if(a<0)
      {
       // System.out.println(a);
        if(maxp!=0)
        {sum+=maxp;
        maxp=0;}
        if(Math.abs(maxn)> Math.abs(a))
        {   maxn=a;
          //System.out.println("2+");
        }
      }

    }
    //sum+=maxp+maxn;
      if(maxp!=0)
        sum+=maxp;
      if(maxn!=Long.MAX_VALUE)
        sum+=maxn;
      System.out.println(sum);

    }
  }
}
