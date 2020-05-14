
import com.sun.deploy.security.SelectableSecurityManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import org.w3c.dom.ls.LSInput;


public class Electronics_Shop {
  static ArrayList<Integer>bl=new ArrayList<>();
  public static int Bs(int l,int h,int ele)
  {
    while(l<=h)
    {
      int mid=(l+h)/2;
      if(bl.get(mid)==ele)
        return mid;
      else if(ele>bl.get(mid))
        l=mid+1;
      else
        h=mid-1;
    }
    return l;
  }

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    HashMap<String, Boolean> hm = new HashMap<>();

//    int t1=Integer.parseInt(br.readLine());
//    for(int t=0;t<t1;++t) {

    String s1[]=br.readLine().trim().split(" ");
    int p=Integer.parseInt(s1[0]);
    int m=Integer.parseInt(s1[1]);
    int n=Integer.parseInt(s1[2]);
    ArrayList<Integer>al=new ArrayList<>();

    String s2[]=br.readLine().trim().split(" ");
    for(String s:s2)
      al.add(Integer.parseInt(s));
    String s3[]=br.readLine().trim().split(" ");
    for(String s:s3)
      bl.add(Integer.parseInt(s));
    Collections.sort(bl);
  //  System.out.println(bl.toString());

    int mindiff=Integer.MAX_VALUE;
    boolean flag=false;
    for(int i=0;i<m;++i)
    {
      int a = al.get(i);
      int ele=p-a;
      if(ele<bl.get(0))
        continue;
      flag=true;
      int index=Bs(0,bl.size()-1,ele);
      if(index<bl.size()&&bl.get(index)==ele)
      {
        System.out.println(p);
        return;
      }
      else
      {
        if(mindiff>(p-a-bl.get(index-1)))
          mindiff=p-a-bl.get(index-1);
      }

    }
    if (flag) {
      System.out.println(p - mindiff);

    } else {
      System.out.println(-1);
    }
  }
}




