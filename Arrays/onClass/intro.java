package onClass;
public class intro{
    private static void update(int marks[]) {
       for(int i =0; i<marks.length;i++){
        System.out.println(marks[i]);
       }
    }
    public static void main(String[] args) {
        int marks[] = {12, 34 , 55 , 64};
        update(marks);
    }
}