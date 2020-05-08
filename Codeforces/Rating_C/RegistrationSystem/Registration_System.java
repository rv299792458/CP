
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;

public class Registration_System {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t = Integer.parseInt(br.readLine());
    HashMap<String,Integer>hm=new HashMap<>();
    for (int t1 = 0; t1 < t; ++t1) {
    String s=br.readLine();
    if(hm.get(s)==null)
    {
      System.out.println("OK");
      hm.put(s,0);
    }
    else
    {
      hm.put(s,hm.get(s)+1);
      System.out.println(s+hm.get(s));
    }

    }
  }
}

