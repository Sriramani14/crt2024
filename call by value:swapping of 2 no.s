call by value

#include <stdio.h>
#include<stdlib.h>
void swap(int x,int y){
    int t;
    t=x;
    x=y;
    y=t;
   
}
int main() {
 int a,b;
 scanf("%d%d",&a,&b);   
printf("before swap a=%d,b=%d\n",a,b) ;
swap(a,b);
    printf("after swap a=%d,b=%d",a,b);

}
