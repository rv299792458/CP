import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Random;


public class Make_Them_Odd {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int t1=Integer.parseInt(br.readLine());

    for(int t=0;t<t1;++t) {
      int n=Integer.parseInt(br.readLine());
      String []s1= br.readLine().trim().split(" ");
      PriorityQueue<Integer>pq=new PriorityQueue<>(new Comparator<Integer>() {
        @Override
        public int compare(Integer o1, Integer o2) {
          return Integer.compare(o2,o1);
        }
      });
      HashMap<Integer,Integer>hm=new HashMap<>();
      for(String s:s1)
      {
        int h=Integer.parseInt(s);
        if(h%2==0)
        {
          if(hm.get(h)==null)
            hm.put(h,1);
          else
            hm.put(h,hm.get(h)+1);
          pq.add(h);
        }

      }
      int ans=0;
      while(!hm.isEmpty())
      {
        ++ans;
        int h=pq.peek();
        int size=hm.get(h);
        for(int i=0;i<size;++i)
        {
          pq.poll();
          if(h%4==0)
          pq.add(h/2);
        }
        hm.remove(h);
        if(h%4==0)
        {
          if(hm.get(h/2)==null)
            hm.put(h/2,size);
          else
            hm.put(h/2,hm.get(h/2)+size);
        }
      }
      System.out.println(ans);

    }
    }


    }


