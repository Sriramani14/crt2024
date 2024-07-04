import java.util.*;
class Hello{
    int admno;
    String name;
    void get(){
        Scanner s=new Scanner(System.in);
        admno=s.nextInt();
        name=s.next();
    }
    void show(){
        System.out.println(admno+" "+name);
    }
    public static void main(String[] args) {
        Hello s1=new Hello();
        s1.get();
        s1.show();
    }
}