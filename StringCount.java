import java.util.*;
class StringCount{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
       int a=0,u=0,l=0,d=0,sy=0;
       for(int i=0;i<s1.length();i++){
           char c=s1.charAt(i);
             if(Character.isLetter(c)){
                 a++;
             
              if(Character.isUpperCase(c)){
                       u++;
                  }
            else if(Character.isLowerCase(c)){
                      l++;
                  }
             }
             else if(Character.isDigit(c)){
                  d++;
             }
        
        else{
             sy++;
        }
       }
       System.out.println("Alphabets:"+a);
       System.out.println("Upper Case Letters:"+u);
       System.out.println("Lower Case Letters:"+l);
       System.out.println("Digits:"+d);
       System.out.println("Special Symbols:"+sy);
}
}