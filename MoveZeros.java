import java.util.*;
class MoveZeros{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int a[]=new int[n];
        for(int i=0;i<n;i++){
            a[i]=s.nextInt();
        }
        int t[]=new int[n];
        int j=0;
        for(int i=0;i<n;i++){
            if(a[i]!=0){
                t[j++]=a[i];
            }
        }
        for(int i=0;i<n;i++){
            System.out.print(t[i]+ " ");
        }
    }
}