
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;


public class Perform_The_Combo {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t) {
      ArrayList<Integer>al=new ArrayList<>();
      HashMap<Integer,Integer>hm=new HashMap<>();
      String sa[] = br.readLine().trim().split(" ");
      String s = br.readLine();
      String sb[] = br.readLine().trim().split(" ");
      for(String s1:sb)
      {
        al.add(Integer.parseInt(s1));
      }
      Collections.sort(al);
      int c=0;
      long arr[] = new long[26];
      for (int i = 0; i < s.length(); ++i)
      {
        char ch=s.charAt(i);

        int index=ch-97;
        if(hm.get(index)==null)
        {
          hm.put(index,1);
        }
        else
          hm.put(index,hm.get(index)+1);
        arr[index]+=1;
        if(c<al.size())
        while(i+1==al.get(c))
        {
          for(int j=0;j<26;++j)
          {
            if(arr[j]!=0)
            arr[j]+=hm.get(j);
          }
          ++c;
          if(c>=al.size())
            break;
        }
      }
      for(int j=0;j<26;++j)
      {
        System.out.print(arr[j]+" ");
      }
      System.out.println();

    }
    }
  }



