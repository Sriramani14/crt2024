import java.util.*;
class GenericVectorColl{
    public static void main(String[] args) {
       Vector<Integer> v1=new Vector<>();
       System.out.println(v1.capacity());
       for(int i=1;i<=20;i++){
          v1.add(i);
       }
       System.out.println(v1);
      System.out.println(v1.capacity());
       v1.add(88);
       System.out.println(v1.capacity());
       System.out.println(v1.size());
    }
}