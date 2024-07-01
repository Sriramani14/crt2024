import java.util.*;
class StringReplace{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1="java is simple language";
        System.out.println(s1);
        System.out.println(s1.replace("simple","difficult"));
       System.out.println(s1.indexOf("simple"));
        System.out.println(s1.indexOf("i"));
        System.out.println(s1.lastIndexOf("i"));
       
    }
}