
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Queue;

public class Card_Constructions {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());

    for(int t=0;t<t1;++t) {
      ArrayList<Long> al = new ArrayList<>();
      long l = Long.parseLong(br.readLine());
      al.add((long)0);
      int i=1;
      while (true)
      {
        long n=i*2+(i-1)+al.get(i-1);
        if(n<=l)
        {
          al.add(n);
          ++i;
        }
        else
        break;
      }
     // System.out.println(al.toString());

      int ans=0;
      while(l>=2)
      {
        int left=1;
        int right=al.size()-1;
        long sub=0;
        while(left<=right)
        {
          int mid=(left+right)/2;

          if(l>al.get(mid))
            left=mid+1;
          if(l<al.get(mid))
            right=mid-1;
          if(al.get(mid)==l)
          {
            sub=al.get(mid);
            break;
          }else
          {
            sub=al.get(left-1);
          }
         // System.out.println("inner");
        }
       // System.out.println(l);
        l-=sub;
        ++ans;
      }
      System.out.println(ans);


    }
  }
}

