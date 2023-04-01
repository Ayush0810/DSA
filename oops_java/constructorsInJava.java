public class constructorsInJava {
String modelName;
int modelYear;

    public constructorsInJava(int year , String name){
        modelName = name;
        modelYear = year;

    }
    public static void main(String[] args) {
        constructorsInJava cj = new constructorsInJava(1969, "mustang");
        System.out.println(cj.modelYear +" " + cj.modelName);
    }
}
