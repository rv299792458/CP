import com.sun.xml.internal.ws.policy.EffectiveAlternativeSelector;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;



public class Array_Sharpening {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t) {
      int n=Integer.parseInt(br.readLine());
      String s1[]=br.readLine().trim().split(" ");
      ArrayList<Long>al=new ArrayList<>();
      int i=0,prefix=0,suff=0;
      boolean preflag=true,suflag=true;
      for(String s:s1)
      {
        Long l=Long.parseLong(s);
        al.add(l);
        if(preflag&&l>=i)
          prefix=i;
        else
          preflag = false;
        ++i;
      }
      for(i=n-1;i>=0;--i)
      {
        if(suflag&&al.get(i)>=(n-1-i))
          suff=i;
        else
          suflag=false;
      }
      if (suff <= prefix) {
        System.out.println("Yes");
       // System.out.println(suff+" "+prefix);
      } else {
        System.out.println("No");
      }
    }


  }
}
