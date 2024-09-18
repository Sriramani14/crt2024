import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int x){
        data=x;
        next=null;
    }
}
class SingleList
{
    Node head,tail;
    SingleList(){
        head=tail=null;
    }
    void create(int x){
        Node n=new Node(x);
        if(head==null){
            head=tail=n;
        }
        else{
            Node temp=head;
            while(temp!=null){
                if(x==temp.data){
                    return;
	        
                }
            }
            tail.next=n;
            tail=n;
        }
    }
    void display()
    {
        if(head==null)
        {
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
           temp=temp.next;
        }
    }
    
}
class LinkedListAvoidDuplicates
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        SingleList s1=new SingleList();
        for(;;){
        System.out.println();
         System.out.println("1.Create\n2.Print\n3.Exit");
          System.out.println("Enter your choice");
          int ch=s.nextInt();
          if(ch==1){
              int x;
               System.out.println("Enter an element");
               x=s.nextInt();
               s1.create(x);
          }
          else if(ch==2)
          {
              s1.display();
          }
          
          else if(ch==3)
                 break;
          else
            System.out.println("Invalid chhoice");
    }
}
}