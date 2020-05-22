
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StreamCorruptedException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class week1_1 {
  public static void main(String[] args) throws NumberFormatException, IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    //ArrayList<Integer>al=new ArrayList<>();
    String s = br.readLine();
    Stack<Character> st = new Stack<>();
    Stack<Integer> index = new Stack<>();
    HashMap<Character, Character> hm = new HashMap<>();
    hm.put('}', '{');
    hm.put(')', '(');
    hm.put(']', '[');
    int len = s.length();
    char ch;
    for (int i = 0; i < len; ++i) {
      ch = s.charAt(i);
      if (ch == '(' || ch == '{' || ch == '[')
      {st.push(ch);
        index.push(i+1);
      }
      else if (ch == ')' || ch == '}' || ch == ']') {

          char ch2;
        if(!st.empty())
        {
          ch2 = st.peek();
        }else
        {
          System.out.println(i+1);
          return;
        }

        if (ch2==hm.get(ch))
        {
          if(!st.empty())
          {
            st.pop();
            index.pop();
          }else
          {
            System.out.println(i+1);
            return;
          }
        }
        else
        {
          System.out.println(i+1);
          return;
        }
      }

    }
    if (st.empty()) {
      System.out.println("Success");
    } else {
      System.out.println(index.peek());
    }

  }
}
