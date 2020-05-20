import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Comparator;
//import java.util.Deque;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashMap;
import javafx.beans.binding.StringBinding;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Random;


public class Game_With_Array {

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String s[]=br.readLine().trim().split(" ");
    int parts=Integer.parseInt(s[0]);
    int sum=Integer.parseInt(s[1]);
    if (parts <= sum/2) {
      System.out.println("YES");
      StringBuilder sb = new StringBuilder();
      for (int i = 1; i <= parts - 1; ++i)
        sb.append(1 + " ");
      sb.append((sum - parts + 1));
      System.out.println(sb);
      System.out.println(sum / 2);
    } else {
      System.out.println("NO");
    }

    }
    }






