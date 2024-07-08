import java.util.*;
class SubArraysSum{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int ls=0,i;
        for(i=0;i<n;i++){
            ls=ls+a[i];
        }
        int rs=0;
        for(i=n-1;i>=0;i--){
           rs=rs+a[i];
           ls=ls-a[i];
           if(ls==rs){
               for(int j=0;j<i;j++){
                   System.out.print(a[j]+" ");
               }
               System.out.println();
               for(int j=i;j<n;j++){
                   System.out.print(a[j]+" ");
               }
               break;
           }
        }
        if(i<0){
            System.out.print("Not Possible");
        }
    }
}