
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

class week4_3{

  static ArrayList<Integer> al = new ArrayList<>();

  public static void main(String[] args) throws Exception {
    File file = new File("C:\\Users\\rv602\\Desktop\\input1.txt");
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n = Integer.parseInt(br.readLine());
    String s[] = br.readLine().trim().split(" ");
    ArrayList<Integer> al = new ArrayList<>();
    for (String s1 : s) {
      al.add(Integer.parseInt(s1));
    }
    Collections.sort(al);
    System.out.println(al.toString().replace("[","").replace("]"," ").replace(","," "));


  }

}

