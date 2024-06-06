while loop
print sum of n natural no.s

#include <stdio.h>

int main() {
  int a=1,sum=0;
  int n;
  scanf("%d",&n);
  while(a<=n){
      sum=sum+a;
      a=a+1;
     
  }
  printf("sum :%d\n",sum);
    return 0;
}
