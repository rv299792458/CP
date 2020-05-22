//Ques 4(max in stack)
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class CC {
  Stack<Integer>st=new Stack<>();
  Stack<Integer>MaxSt=new Stack<>();

  void push(int v)
  {
    st.push(v);
    if(MaxSt.empty())
      MaxSt.push(v);
    else
    {
      int top=MaxSt.peek();
      MaxSt.push(Math.max(top,v));
    }
  }
  void pop()
  {
    if(!st.empty())
    {
      st.pop();
      MaxSt.pop();
    }
  }

  int max()
  {
    if(!MaxSt.empty())
      return MaxSt.peek();
    else
      return -1;
  }



  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //ArrayList<Integer>al=new ArrayList<>();
    CC stack=new CC();
    int n=Integer.parseInt(br.readLine().trim());
    for(int i=0;i<n;++i)
    {
      String s[]=br.readLine().trim().split(" ");
      if(s[0].equals("push"))
        stack.push(Integer.parseInt(s[1]));
      if(s[0].equals("pop"))
        stack.pop();
      if (s[0].equals("max")) {
        System.out.println(stack.max());
      }
    }



  }
}
