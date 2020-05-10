import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Queue;

public class Two_Teams_Composing {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t)
    {
      HashMap<String ,Integer> hm=new HashMap<>();
    int n=Integer.parseInt(br.readLine());
    String s[]=br.readLine().trim().split(" ");
      for(String s1:s)
      {
        if(hm.get(s1)==null)
          hm.put(s1,1);
        else
          hm.put(s1,hm.get(s1)+1);
      }
      int count=0;
      int maxfre=0;
      for(String i:hm.keySet())
      {
        ++count;
      //  System.out.println(hm.get(i)+" "+i);
        if(maxfre<hm.get(i))
          maxfre=hm.get(i);
      }
      //System.out.println(maxfre+" "+count);
      int ans=Math.max(Math.min(maxfre,count-1),Math.min(maxfre-1,count));
      System.out.println(ans);
    }
  }
}
