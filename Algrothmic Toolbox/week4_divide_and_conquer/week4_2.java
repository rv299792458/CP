//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.InputStreamReader;
//import java.util.ArrayList;
//
//class cc {
//
//  public static void main(String[] args) throws Exception {
//    File file = new File("C:\\Users\\rv602\\Desktop\\input1.txt");
//    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//    //int n = Integer.parseInt(br.readLine());
//    String s1[] = br.readLine().trim().split(" ");
//    int s=Integer.parseInt(s1[0]);
//    int p=Integer.parseInt(s1[1]);
//    for ()
//
//
//  }
//}
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

class week4_2{

  static ArrayList<Integer> al = new ArrayList<>();

  public static void main(String[] args) throws Exception {
    File file = new File("C:\\Users\\rv602\\Desktop\\input1.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
//    int maj=0;
//    if(n%2==0)
//      maj=n/2;
//    else
//      maj=n/2+1;
    String s2[] = br.readLine().trim().split(" ");
    HashMap<Integer,Integer> hm=new HashMap<>();
    for(String s:s2)
    {
      int a=Integer.parseInt(s);
      if(hm.get(a)==null)
        hm.put(a,1);
      else
        hm.put(a,hm.get(a)+1);
    }
    int flag=0;
    for (Integer k:hm.keySet())
    {
      if (hm.get(k) > n/2) {

        flag=1;
        break;
      }

    }
    System.out.println(flag);


  }

}



