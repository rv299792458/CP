import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Comparator;
//import java.util.Deque;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Random;


public class Snow_Walking_Robot {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    int n=Integer.parseInt(br.readLine());
    for(int t=0;t<n;++t)
      {
        String s=br.readLine();
        int size=s.length();
        HashMap<Character,Integer>hm=new HashMap<>();
        hm.put('L',0);
        hm.put('U',0);
        hm.put('D',0);
        hm.put('R',0);
        for(int i=0;i<size;++i)
        {
          char ch=s.charAt(i);
          hm.put(ch,hm.get(ch)+1);
        }
        int lr=Math.min(hm.get('L'),hm.get('R'));
        int ud=Math.min(hm.get('U'),hm.get('D'));
        if(lr==0&&ud==0)
        {
          System.out.println(0);
          System.out.println();
          continue;
        }
        if(lr==0)
        {
          System.out.println("2\nUD");
          continue;
        }
        if(ud==0)
        {
          System.out.println("2\nLR");
          continue;
        }
        StringBuilder ans=new StringBuilder();
        for(int i=0;i<lr;++i)
          ans.append("L");
        for(int i=0;i<ud;++i)
          ans.append("U");
        for(int i=0;i<lr;++i)
          ans.append("R");
        for(int i=0;i<ud;++i)
          ans.append("D");
        System.out.println(ans.length());
        System.out.println(ans);
      }
    }
    }






