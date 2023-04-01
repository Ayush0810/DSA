// public class class_method {
// static void myMethod(){
//     System.out.println("called without creating object");
// }

// public void myMethod2(){
//     System.out.println(" called by creating object");

// }
// public void main(String[] args) {
//     myMethod();
//     class_method cm = new class_method();
//       cm.myMethod2();
// }

// static void fullThrottle(){
//     System.out.println("the car is moving at a very high speed");
// }

// static void speed(int maxSpeed){
//     System.out.println("max speed is" + maxSpeed);
// }

//learning about abstract class
abstract class class_method {
    public String fname = "john";
    public int age = 24;

    public abstract void study();

}

class Student extends class_method {
    public int graduationYear = 2018;

    public void study() {
        System.out.println("studying all day long");
    }
}