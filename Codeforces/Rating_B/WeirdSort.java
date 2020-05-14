
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import org.w3c.dom.ls.LSInput;


public class WeirdSort {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t) {
      ArrayList<Integer>al=new ArrayList<>();
      String s1[]=br.readLine().trim().split(" ");
      int n= Integer.parseInt(s1[0]);
      String s2[]=br.readLine().trim().split(" ");
      for(String s:s2)
      {
        al.add(Integer.parseInt(s));
      }
      String s3[]=br.readLine().trim().split(" ");
      HashMap<Integer,Boolean>hm=new HashMap<>();
      for(String s:s3)
      {
        int k=Integer.parseInt(s);
          hm.put(k-1,true);
      }boolean flag=true;
      for(int i=0;i<n-1;++i)
      {
        for(int j=0;j<n-1-i;++j)
        {
          if(al.get(j)>al.get(j+1))
          {
            if(hm.get(j)==null)
            {
              flag=false;
              break;
            }
            if(hm.get(j)==true)
            {
              int temp=al.get(j);
              al.set(j,al.get(j+1));
              al.set(j+1,temp);
            }


          }
        }

        if(!flag)
          break;
      }

      if (flag) {
        System.out.println("YES");
      } else {
        System.out.println("NO");
      }

    }

  }


  }



