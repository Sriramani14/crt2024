interface Vehicle{
void noOfWheels();
}
class Car implements Vehicle{
    public void noOfWheels(){
        System.out.println("4 wheels");
    }
}
class Bus implements Vehicle{
    public void noOfWheels(){
        System.out.println("6 wheels");
    } 
}
class Auto implements Vehicle{
public void noOfWheels(){
System.out.println("3 wheels");
}
}
class InterfaceEx1{
    public static void main(String[] args) {
        Car c1=new Car();
	c1.noOfWheels();
	Bus b1=new Bus();
	b1.noOfWheels();
	Auto a1=new Auto();
	a1.noOfWheels();
    }
}