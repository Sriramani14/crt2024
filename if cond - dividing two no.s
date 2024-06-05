if condition
dividing two no.s

#include <stdio.h>

int main() {
   int a,b;
   scanf("%d%d",&a,&b);
   if(b==0){
       
       printf("can't divide with zero.\n so assigning b=1");
       b=1;
   }
   int r=a/b;
   printf("%d",r);

    return 0;
}
