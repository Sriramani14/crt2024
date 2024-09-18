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
    void insertfirst(int x){
        Node n=new Node(x);
        if(head==null){
            head=tail=n;
        }
        else{
            n.next=head;
            head=n;
        }
    }
    void insertposition(int x,int pos){
        Node n=new Node(x);
        if(head==null){
            head=tail=n;
        }
        else{
            Node temp=head;
            int count=2;
            while(count<pos && temp.next!=null){
                count++;
                temp=temp.next;
            }
            if(temp.next==null){
                temp.next=n;
                tail=n;
            }
            else{
                n.next=temp.next;
                temp.next=n;
            }
        }
    }
    void deletefirst(){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        System.out.println(head.data+" is deleted");
        head=head.next;
    }
    void deletelast(){
        if(head==null){
System.out.println("List is empty");
return;
        }
       Node temp=head;
       if(temp.next==null){
           System.out.println(temp.data+" is deleted");
       head=tail=null;
       return;
       }
       while(temp.next.next!=null)
       temp=temp.next;
     System.out.println(temp.next.data+" is deleted");  
     temp.next=null;
     tail=temp;
    }
    void deleteposition(int pos){
        if(head==null){
            System.out.println("List is empty");
            return;
        }
        Node temp=head;
        int count=2;
        if(temp.next==null){
             System.out.println(temp.next.data+" is deleted"); temp.next=null;
                 return;
        }
        while(count<pos && temp.next.next!=null){
            count++;
            temp=temp.next;
            
        }
        if(temp.next.next==null){
            System.out.println(temp.next.data+" is deleted");
           temp.next=null;
            tail=temp;
        }
        else{
            System.out.println(temp.next.data+" is deleted");
             Node temp1=temp.next;
             temp.next=temp.next.next;
             temp1.next=null;
        }
    }
}
class LinkedListSingle
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        SingleList s1=new SingleList();
        for(;;){
        System.out.println();
         System.out.println("1.Create\n2.Print\n3.Insert First\n4.Insert any position\n5.Delete First\n6.Delete Last\n7.Delete any Position\n8.Exit");
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
          else if(ch==3){
              int x;
              System.out.println("Enter an element:");
              x=s.nextInt();
              s1.insertfirst(x);
          }
          else if(ch==4){
              int x,pos;
              System.out.println("enter element and position");
              x=s.nextInt();
              pos=s.nextInt();
              s1.insertposition(x,pos);
          }
          else if(ch==5){
              s1.deletefirst();
          }
          else if(ch==6){
              s1.deletelast();
          }
          else if(ch==7){
              int pos;
              System.out.println("Enter position:");
              pos=s.nextInt();
              s1.deleteposition(pos);
          }
          else if(ch==8)
                 break;
          else
            System.out.println("Invalid chhoice");
    }
}
}

