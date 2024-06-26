import java.util.*;
class SelectionSort{

static void selectionsort(int a[],int n){
for(int i=0;i<n;i++){
int min=i;
for(int j=i+1;j<n;j++){
if(a[min]>a[j])
{
min=j;
}
}
int t=a[i];
a[i]=a[min];
a[min]=t;
}
}
public static void main(String agrs[]){
Scanner s=new Scanner(System.in);
int n=s.nextInt();
int a[]=new int[n];
for(int i=0;i<n;i++){
a[i]=s.nextInt();
}
selectionsort(a,n);
for(int i=0;i<n;i++){
System.out.print(a[i]+" ");
}
}
}