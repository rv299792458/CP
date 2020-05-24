
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Stack;

public class CC {
  public static class Thread
  {
    long time, index;
    public Thread(long index,long time)
    {
      this.time=time;
      this.index=index;
    }
    public long getTime()
    {
      return time;
    }
    public long getIndex()
    {
      return index;
    }
  }

static class the_Comparator implements Comparator<Thread>{

  @Override
  public int compare(Thread o1, Thread o2) {
    if(o1.time==o2.time)
    {
      if(o1.index<=o2.index)
        return -1;
      else
        return 1;
    }
    else {
      if(o1.time<o2.time)
        return -1;
      else
        return 1;
    }
//  if(Long.compare(o1.time,o2.time)==0)
//    return Long.compare(o1.index,o2.index);
//  else
//    return Long.compare(o1.time,o2.time);
  }
}

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s[]=br.readLine().trim().split(" ");
    int thread=Integer.parseInt(s[0]);
    int n=Integer.parseInt(s[1]);
    ArrayList<Thread>al=new ArrayList<>();
    PriorityQueue<Thread>pq=new PriorityQueue<Thread>(thread+2,new the_Comparator());
    long arr[][]=new long[thread][2];
    for(int i=0;i<thread;++i)
    {
      Thread th=new Thread(i,0);
    pq.add(th);
    al.add(th);
    }
    Collections.sort(al, new the_Comparator());

        String s1[]=br.readLine().trim().split(" ");
    ArrayList<String>work=new ArrayList<>();
    for(String j:s1)
    {
      long wk=Long.parseLong(j);
      Thread t=pq.poll();
      System.out.println(t.index+" "+t.time);
      Thread th=new Thread(t.index,t.time+wk);
      pq.add(th);

    }


//for(Thread el:al)
//{
//  System.out.println(el.index+" "+el.time);
//}
//    while (!pq.isEmpty()) {
//      Thread r=pq.poll();
//      System.out.println(r.time+" "+r.index);
//    }

//
//    String s1[]=br.readLine().trim().split(" ");
//    ArrayList<Long>al=new ArrayList<>();
//    for(String j:s1)
//      al.add(Long.parseLong(j));
//    int removed=0;
//    // System.out.println(al.size());
//    for(int i=0,j=0;i<al.size();++i,++j)
//    {
//      if(j>=thread)
//      { j=0;
//
////      for(int k=0;k<thread;++k)
////      {
////        System.out.println(arr[j][]++arr[][]);
////      }
//        sortbyColumn(arr,0);
//      }
//      System.out.println(arr[j][1]+" "+arr[j][0]);
//
//      arr[j][0]+=al.get(i);

    }
  }



