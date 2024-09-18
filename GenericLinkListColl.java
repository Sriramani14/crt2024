import java.util.*;
class GenericLinkListColl{
    public static void main(String[] args) {
       LinkedList<Integer> l1=new LinkedList<>();
       l1.add(12);
       l1.add(45);
       l1.add(76);
       System.out.println(l1);
       System.out.println(l1.get(0));
       System.out.println("for loop:");
       for(int i=0;i<l1.size();i++){
           System.out.println(l1.get(i));
       }
       System.out.println("for each loop:");
       for(Integer e:l1){
           System.out.println(e);
       }
       System.out.println("Iterator:");
       Iterator it=l1.iterator();
       System.out.println(it.next());
       while(it.hasNext()){
           System.out.println(it.next());
       }
       
    }
}