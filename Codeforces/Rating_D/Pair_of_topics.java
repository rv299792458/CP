import java.io.BufferedReader;
//import java.io.CharConversionException;
import java.io.IOException;
import java.io.InputStreamReader;

//import java.util.Comparator;
//import java.util.Deque;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import javafx.beans.binding.StringBinding;
import javax.xml.bind.SchemaOutputResolver;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Random;


public class Pair_of_topics {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());
        String s1[]=br.readLine().trim().split(" ");
        String s2[]=br.readLine().trim().split(" ");
        ArrayList<Long>al=new ArrayList<>();
        for (int i = 0; i < t; ++i) {
            al.add(Long.parseLong(s1[i])-Long.parseLong(s2[i]));
        }
        Collections.sort(al);
        Collections.reverse(al);
        //System.out.println(al.toString());
        int a=0,b=t-1;
        long ans=0;
        while(a<b)
        {
            if(al.get(a)<=0)
                break;
           if(al.get(a)+al.get(b)>0)
           {ans+=b-a;
           ++a;
           }
           else
               --b;


        }
        System.out.println(ans);

        }

    }








