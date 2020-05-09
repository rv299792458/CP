
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

public class Sorted_Adjacent_Differences {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t)
    {
      int n=Integer.parseInt(br.readLine());
      ArrayList<Integer>al=new ArrayList<>();
      ArrayList<Integer>bl=new ArrayList<>();
      String s[]=br.readLine().trim().split(" ");
      for(String s1:s)
      {
       al.add(Integer.parseInt(s1));
      }
      Collections.sort(al);
      int index=al.size()/2;
      int k=al.size();
      bl.add(al.get(index));
      --k;
      int a=1;
      while(k>0)
      {
        if(index-a>=0)
        bl.add(al.get(index-a));
        if(index+a<n)
        bl.add(al.get(index+a));
        ++a;
        k-=2;
      }
      System.out.println(bl.toString().replace("[","").replace("]","").replace(",",""));
    }
  }
}

