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


class week4_1{

  static ArrayList<Integer> al = new ArrayList<>();

  public static void main(String[] args) throws Exception {
    File file = new File("C:\\Users\\rv602\\Desktop\\input1.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String s1[] = br.readLine().trim().split(" ");
    String s2[] = br.readLine().trim().split(" ");
    int n = Integer.parseInt(s1[0]);
    //System.out.println(n);
    for (int i = 1; i <= n; ++i) {
      al.add(Integer.parseInt(s1[i]));
    }
    // System.out.println(al.toString());
    int t1 = Integer.parseInt(s2[0]);
    for (int t = 1; t <= t1; ++t) {
      int v = Integer.parseInt(s2[t]);
      int index = Binserach(0, n - 1, v);
      System.out.print(index + "  ");
    }

  }

  static int Binserach(int low, int high, int val) {
    if (low > high)
      return -1;
    int mid = (high + low) / 2;
    if (al.get(mid) == val)
      return mid;
    else {
      if (al.get(mid) > val)
        return Binserach(low, mid - 1, val);
      else
        return Binserach(mid + 1, high, val);
    }
  }
}



