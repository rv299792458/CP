import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
//import java.util.Arrays;
//import java.util.Collections;
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.LinkedList;
//import java.util.Queue;

public class Anti_Sudoku {


  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int t1=Integer.parseInt(br.readLine());
    for(int t=0;t<t1;++t)
    {
      StringBuilder ans=new StringBuilder();
     int suduko[][]=new int[9][9];
    // int ans[][]=new int[9][9];

     for(int i=0;i<9;++i)
     {
       String s=br.readLine();
       for(int j=0;j<9;++j)
       suduko[i][j]=Integer.parseInt(String.valueOf(s.charAt(j)));
     }int a1=0,a2=0,b1=1,b2=3,c1=2,c2=6,add=0,rowadd=0,loop=0,jump=0;
     while(loop<3)
     {
       //System.out.println(a1+" "+a2+" "+add+" "+rowadd);
       suduko[rowadd+a1][add+(a2+1)-jump]=suduko[rowadd+a1][add+a2];
       suduko[rowadd+b1][add+(b2+1)-jump]=suduko[rowadd+b1][add+b2];
       suduko[rowadd+c1][add+(c2+1)-jump]=suduko[rowadd+c1][add+c2];
       ++add;
       if(add==2)
         jump=3;
       rowadd+=3;
       ++loop;
     }
      for (int i=0;i<9;++i)
      {
        for (int j = 0; j < 9; ++j) {
          ans.append(suduko[i][j]);
        }
        ans.append('\n');
      }
      System.out.println(ans);

    }
  }
}
