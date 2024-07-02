import java.util.*;
class StringAvail{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        String s1=s.nextLine();
       String s2=s.nextLine();
       if(s1.contains(s2)){
           System.out.println("String found");
       }
       else{
           System.out.println("String not found");
       }
        
}
}