import java.util.*;
class RemoveDuplicates{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int t[]=new int[n];
        int j=0;
        for(int i=0;i<n-1;i++){
            if(a[i]!=a[i+1]){
                t[j++]=a[i];
            }
        }
        t[j++]=a[n-1];
        for(int i=0;i<j;i++){
            System.out.print(t[i]+ " ");
        }
    }
}