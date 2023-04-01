public class opps {
// int x=5;
// //we can create multiple classes and objects in java
// //but there is only one public class 
// public static void main(String[] args) {
//     //object1
//     opps o2 = new opps();//object2
//     //accessing the values of x
//     // System.out.println(o1.x);
//      System.out.println(o2.x);
// }

// }
// class second{
//     public static void main(String[] args) {
//         opps o1 = new opps();
//         System.out.println(o1.x);
//     }

public static void main(String[] args) {
    encapsulation ep  = new encapsulation();
    // ep.name = "ayush"; // unable to access name ..power of private;

    //instead of above we use getName , setName;

    ep.setName("ayush");
    System.out.println(ep.getName());
}
}
