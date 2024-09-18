import java.util.*;
class Node{
    int data;
    Node next,prev;
    Node(int x){
        data=x;
        next=null;
        prev=null;
    }
}
class DoubleList{
    Node head,tail;
    DoubleList(){
        head=tail=null;
    }
    void create(int x){
        Node n=new Node(x);
        if(head==null){
            head=tail=n;
        }
        else{
            tail.next=n;
            n.prev=tail;
            tail=n;
        }
    }
    void forward(){
        if(head==null){
            System.out.println("List is Empty");
            return;
        }
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    void backward(){
        if(head==null){
            System.out.print("List is empty");
            return;
        }
        Node temp=tail;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.prev;
        }
    }
void insertfirst(int x){
Node n=new Node(x);
if(head==null){
 	head=tail=n;
}
else{
head.prev=n;
n.next=head;
head=n;
}
}
}
class DoubleLinklistInsertFirst{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        DoubleList d1=new DoubleList();
        for(;;){
            System.out.println();
            System.out.print("1.Create\n2.Print\n3.Insert at First\n4.Exit\n");
            int ch=s.nextInt();
            if(ch==1){
                System.out.println("Enter element:");
                int x=s.nextInt();
                d1.create(x);
            }
            else if(ch==2){
                System.out.println("\n1.Forward\n2.Backward\n");
                int r=s.nextInt();
                if(r==1){
                    d1.forward();
                }
                 else if(r==2){
                    d1.backward();
                }
                else{
                    System.out.print("Invalid Choice");
                }
            }
            else if(ch==3){
                System.out.println("Enter element");
		int x=s.nextInt();
		d1.insertfirst(x);
            }
	   else if(ch==4){
		break;
		}
            else{
                System.out.println("Invalid Choice");
            }
        }
    }
}