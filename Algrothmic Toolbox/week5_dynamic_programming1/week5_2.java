
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
//import javafx.util.Pair;

//import java.io.File;

public class week5_2{

  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //ArrayList<Integer>al=new ArrayList<>();
    int n = Integer.parseInt(br.readLine());
    int arr[] = new int[n + 1];
    arr[0] = 0;
    arr[1] = 0;
//    al.add(0);
//    al.add(0);
    for(int i=2;i<=n;++i)
    {
      arr[i]=arr[i-1]+1;
      if(i%2==0) { //al.set(i,al.get(i/2));
        arr[i] =  Math.min(arr[i / 2]+1,arr[i]);
      }
      if(i%3==0) {
        // al.set(i,al.get(i/3));
        arr[i] = Math.min(arr[i / 3]+1,arr[i]) ;
      }
      // al.set(i,Math.min((1+al.get(i/2)),(i%3+al.get(i/3))));

    }
    System.out.println(arr[n]);
    ArrayList<Integer>al=new ArrayList<>();
    al.add(n);
    int i=n;
    while(i>1) {
      if (i % 3 == 0 ) {
        // al.set(i,al.get(i/3));
        arr[i] = arr[i / 3] + 1;
        al.add(i / 3);
        i = i / 3;
      } else if (i % 2 == 0 ) { //al.set(i,al.get(i/2));
        arr[i] = arr[i / 2] + 1;
        al.add(i / 2);
        i = i / 2;
      } else {
        arr[i] = 1 + Math.min((1 + arr[i / 2]), (i % 3 + arr[i / 3]));
        if ((1 + arr[i / 2]) < (i % 3 + arr[i / 3])) {
          al.add(i - 1);
          al.add((i - 1) / 2);
          i = (i - 1) / 2;
        } else {
          if (i % 3 == 1) {
            al.add(i - 1);
            al.add((i - 1) / 3);
            i = (i - 1) / 3;
          } else {
            al.add(i - 1);
            al.add(i - 2);
            al.add((i - 2) / 3);
            i = (i - 2) / 3;
          }
        }
      }
    }

    Collections.reverse(al);
    System.out.println(al.toString().replace("]","").replace("[","").replace(",",""));
  }

}
