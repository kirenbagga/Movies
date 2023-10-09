public class QuizDay{
    public static void main(String[] args) {
        test(5);
        
    }
    static void  test(int n){
        if(n>0){
            test(n-1);
        }
        System.out.println(n);
    }
}