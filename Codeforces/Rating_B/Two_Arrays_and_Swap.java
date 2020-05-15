
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;



public class Two_Arrays_and_Swap {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Boolean> hm = new HashMap<>();

    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t) {
      String s1[] = br.readLine().trim().split(" ");
      int n=Integer.parseInt(s1[0]);
      int k=Integer.parseInt(s1[1]);
      String s2[] = br.readLine().trim().split(" ");
      String s3[] = br.readLine().trim().split(" ");
      ArrayList<Integer>al=new ArrayList<>();
      ArrayList<Integer>bl=new ArrayList<>();
      for(int i=0;i<n;++i)
      {
        al.add(Integer.parseInt(s2[i]));
        bl.add(Integer.parseInt(s3[i]));
      }
      Collections.sort(al);
      Collections.sort(bl);
      Collections.reverse(bl);
      int sum=0;
      for(int i=0;i<n;++i)
      {
        if(k>0&&al.get(i)<bl.get(i))
        { sum+=bl.get(i);
          --k;
        }
        else
          sum+=al.get(i);
      }
      System.out.println(sum);
    }
  }
}

