function with return type

#include <stdio.h>
int add(int a,int b){
   int r=a+b;
}
int main() {
    int a,b;
    scanf("%d%d",&a,&b);
   int k=add(a,b);
   printf("%d",k);
    return 0;
}
output:

4
8
12
