
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

public class Taxi {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n=Integer.parseInt(br.readLine());
    String s[]=br.readLine().trim().split(" ");
    ArrayList<Integer>al=new ArrayList<>();
    HashMap<Integer,Integer>hm=new HashMap<>();
    for(int i=0;i<n;++i)
    {
      //al.add();
      int p=Integer.parseInt(s[i]);
      if(hm.get(p)==null)
      {
        hm.put(p,1);
      }
      else
        hm.put(p,hm.get(p)+1);
    }
    int four=0,one=0,two=0,three=0;
    if(hm.get(4)!=null)
      four=hm.get(4);
    if(hm.get(2)!=null)
      two=hm.get(2);
    if(hm.get(3)!=null)
      three=hm.get(3);
    if(hm.get(1)!=null)
      one=hm.get(1);

//    System.out.println(hm.get(4)+" "+hm.get(3)+" "+hm.get(2)+" "+hm.get(1)+" ");
//    System.out.println(four+" "+three+" "+two+" "+one);
    int ans;
    ans=four+three;
    if(three>=one)
    {
      one=0;
    }
    else
    {
      one=one-three;
    }
    if(two!=1)
      ans+=two/2;
    two=two%2;
    if(two==1)
    {
      ans+=1;
      two=0;
      if(one>2)
        one=one-2;
      else
        one=0;
    }
    if(one!=0)
    {
      if(one>=4)
      {ans+=one/4;
      one=one%4;
      }
      if(one>0)
        ans+=1;



    }
    System.out.println(ans);


  }


}

