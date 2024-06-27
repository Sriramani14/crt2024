import java.util.*;
class SortFirst{
    static void sort(int a[],int n){
        if(n%2==0){
        for(int i=n/2;i>=0;i--){
            for(int j=0;j<i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    else{
         for(int i=(n/2)+1;i>=0;i--){
            for(int j=0;j<i-1;j++){
                if(a[j]>a[j+1]){
                    int t=a[j];
                    a[j]=a[j+1];
                    a[j+1]=t;
                }
            }
        }
    }
    }
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
sort(a,n);
for(int i=0;i<n;i++){
    System.out.println(a[i]);
}
    }
}