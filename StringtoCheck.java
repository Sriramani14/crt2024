import java.util.*;
class StringtoCheck{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
       char c=s.next().charAt(0);
        if(Character.isLetterOrDigit(c)){
             System.out.println("Alpha-Numeric");
             if(Character.isLetter(c)){
                  System.out.println("Alphabet");
                  if(Character.isUpperCase(c)){
                       System.out.println("Upper Case");
                  }
                  else{
                       System.out.println("Lower case");
                  }
             }
             else{
                  System.out.println("Digit");
             }
        }
        else{
             System.out.println("Special Symbol");
        }
}
}