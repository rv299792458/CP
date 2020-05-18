import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Comparator;
//import java.util.Deque;
import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Random;


public class Yet_Another_Broken_Keyboard {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//
//    int t1=Integer.parseInt(br.readLine());
//
//    for(int t=0;t<t1;++t) {
      HashMap<Character,Boolean>hm=new HashMap<>();
      String []s1= br.readLine().trim().split(" ");
      String s=br.readLine().trim();
      String [] s2=br.readLine().trim().split(" ");
      int n=Integer.parseInt(s1[0]);
      int k=Integer.parseInt(s1[1]);
      for(String d:s2)
      {
        char ch=d.charAt(0);
        if(hm.get(ch)==null)
          hm.put(ch,true);
      }
      int len=0;
      long ans=0;
      for(int i=0;i<n;++i)
      {
        char ch=s.charAt(i);
        if(hm.get(ch)!=null)
          ++len;
        else
        {
          ans+=((long) len*((long) len+1))/2;

          len=0;
        }
      }
      if(len!=0)
      {
        ans+=((long) len*((long) len+1))/2;

        len=0;
      }
      System.out.println(ans);

    }
    }





