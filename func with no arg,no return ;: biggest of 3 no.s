function with no argem,no return
biggest of 3 no.s

#include <stdio.h>
void biggest(){
     int a,b,c;
    scanf("%d%d%d",&a,&b,&c);
    if(a>b && a>c){
        printf("%d",a);
    }
    else if(b>c){
       printf("%d",b);
}
else{
    printf("%d",c);
}
}
int main() {
    biggest();
    return 0;
}
