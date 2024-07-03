import java.util.*;
class Stringbuffer{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
     StringBuffer str=new StringBuffer("Java");
     StringBuffer str2=new StringBuffer("Language");
    System.out.println(str);
    System.out.println(str2);
    str.append(str2);
    System.out.println(str);
}
}