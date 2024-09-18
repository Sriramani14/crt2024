import java.util.*;
class StackColl{
    public static void main(String[] args) {
      Stack s=new Stack();
      s.push("a");
      s.push("b");
      s.push(14);
      System.out.println(s);
      s.push(88);
      s.push(56);
      System.out.println(s);
     System.out.println(s.pop());
      System.out.println(s.peek());
     System.out.println(s.search("a"));
     System.out.println(s.search(76));
     System.out.println(s.empty());
    }
}