//  class second {
//     public static void main(String[] args) {
//         class_method myCar = new class_method();
//         myCar.speed(30);
//         myCar.fullThrottle();
//     }
// }


//abstraction continue

class Second{
    public static void main(String[] args) {
        Student myObj = new Student();
        System.out.println("Name" + myObj.fname);
        System.out.println("age" + myObj.age);
        System.out.println("graduation Year" + myObj.graduationYear);
        myObj.study();
    }
}