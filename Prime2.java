import java.util.*;
class Prime2{
public static void main(String args[]){
Scanner s=new Scanner(System.in);
int n,r=0,c=0;
n=s.nextInt();
if(n==1){
c=1;
}
else{
for(int i=2;i<=n/2;i++){
r++;
if(n%i==0){
c++;
break;
}
}
}

System.out.println(r);
if(c<=2){
  System.out.println("Prime no");
}
else{
   System.out.println("not prime no.");
}
}
}