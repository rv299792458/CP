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
import java.util.Comparator;
import java.util.HashMap;
import java.util.PriorityQueue;
import javafx.beans.binding.StringBinding;
import javax.xml.bind.SchemaOutputResolver;
//import java.util.LinkedList;
//import java.util.PriorityQueue;
//import java.util.Random;


public class Adding_Powers {

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        for (int i = 0; i < t; ++i) {
            String s[]=br.readLine().trim().split(" ");
            int n=Integer.parseInt(s[0]);
            int k=Integer.parseInt(s[1]);
            String s2[]=br.readLine().trim().split(" ");
          //  ArrayList<Long>al=new ArrayList<>();
            PriorityQueue<Long>pq=new PriorityQueue<>(new Comparator<Long>() {
                @Override
                public int compare(Long o1, Long o2) {
                    if(o1<o2)
                        return 1;
                    else if (o1>o2)
                        return -1;
                    return 0;
                }
            });
            for(String ss:s2)
                pq.add(Long.parseLong(ss));
//                al.add(Long.parseLong(ss));
//            Collections.sort(al);
            HashMap<Integer,Boolean>hm=new HashMap<>();
            boolean ans=true;
            while(!pq.isEmpty())
            {  long ele=pq.poll();
              //  System.out.print(ele+" ");
                if(ele==0)
                {pq.poll();

                continue;}
                long power=1;
                int powerNo=0;
                while(power<=ele)
                {
                    power*=k;
                    ++powerNo;
                }
               // System.out.print(ele+" "+powerNo+"   ");
                if(hm.get(powerNo-1)==null)
                    hm.put(powerNo-1,true);
                else
                {
                    ans=false;
                    break;
                }
                pq.add(ele-power/k);
            }
            if (ans) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }





        }

        }

    }








