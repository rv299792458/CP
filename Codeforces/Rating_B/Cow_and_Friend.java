import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;



public class Cow_and_Friend {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Boolean> hm = new HashMap<>();

    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t) {
      String s1[]=br.readLine().trim().split(" ");
      int n=Integer.parseInt(s1[0]);
      long d= Long.parseLong(s1[1]);
      String s2[]=br.readLine().trim().split(" ");
      Long max=Long.MIN_VALUE;
      boolean flag=false;
      for(String s:s2)
      {
        long fn=Long.parseLong(s);
        if(fn==d)
        {
          System.out.println(1);
          flag=true;
          break;
        }
        if(max<fn)
        {
          max=fn;
        }

      }
      if(!flag)
      System.out.println((int)Math.max(2,Math.ceil((1.0*d)/max)));

    }
  }
}
