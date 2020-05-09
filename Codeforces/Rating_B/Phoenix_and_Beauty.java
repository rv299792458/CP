
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Phoenix_and_Beauty {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());

    for(int t=0;t<t1;++t)
    {
      String s[]=br.readLine().trim().split(" ");
      int n=Integer.parseInt(s[0]);
      int k=Integer.parseInt(s[1]);
      HashMap<Integer,Integer>hm=new HashMap<>();
      String s1[]=br.readLine().trim().split(" ");
      for(String l:s1)
      {
        int l1=Integer.parseInt(l);
        if(hm.get(l1)==null)
        {
          hm.put(l1,1);
        }

      }
      int dis_element=0;
      ArrayList<Integer>al=new ArrayList<>();
      for(Integer i:hm.keySet())
      {
        ++dis_element;
        al.add(i);
      }
      if(al.size()>k)
      {
        System.out.println(-1);
        continue;
      }
      else
      {
        if(al.size()<k)
        {
          int size=al.size();
          for(int i=0;i<k-size;++i)
            al.add(1);
        }
      }

      System.out.println(n*k);
      for(int i=0;i<n;++i)
      {
        System.out.print(al.toString().replace("[","").replace("]","").replace(",","")+" " );
      }
      System.out.println();


    }
//



  }


}

