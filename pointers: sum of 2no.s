pointer: sum of 2 no.s

#include <stdio.h>
int main() {
 int a,b,c,*p,*q;
 p=&a;
 q=&b;
 scanf("%d%d",p,q);
 c=*p+*q;
 printf("sum=%d",c);
    return 0;
}
