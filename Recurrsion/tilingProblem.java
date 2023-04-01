
public class tilingProblem {
    public static int problem(int N){
        if(N==1||N==0) return 1;
        return problem(N-1) + problem(N-2);

    }
    public static void main(String[] args) {
        System.out.println(problem(5));
    }
}
