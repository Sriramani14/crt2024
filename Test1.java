class Father {
    void surname(){
        System.out.println("k");
    }
    void designation(){
        System.out.println("Clerk");
    }
}
class Child extends Father{
    void getname(){
        System.out.println("satish");
    }
    void designation(){
        System.out.println("java programmer");
    }
    
}
class Test1{
    public static void main(String[] args) {
        Child c1=new Child();
        c1.getname();
        c1.surname();
        c1.designation();
        System.out.println();
    }
}