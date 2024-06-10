recursion - sum of n no.s

#include <stdio.h>
int add( int n){
    if(n==0){
        return 0;
    }
    else {
        return n+add(n-1);
    }
}
int main() {
   int n;
   scanf("%d",&n);
   int k=add(n);
   printf("%d",k);
}
