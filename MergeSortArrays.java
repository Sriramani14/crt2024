import java.util.*;
class MergeSortArrays{
    
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
int m=s.nextInt();
int b[]=new int[m];
for(int i=0;i<m;i++){
b[i]=s.nextInt();
}
int c[]=new int[m+n];
int k=0;
for(int j=0;j<n;j++){
c[j]=a[j];
k++;
    }
    for(int j=0;j<m;j++){
        c[k]=b[j];
        k++;
    }
    Arrays.sort(c);
    for(int i=0;i<k;i++){
        System.out.print(c[i]+ " ");
    }
}
}