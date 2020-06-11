package tryagain;

public class Main {
    public static void main(String[] args) {
        try {
            int byZero = 25 / 0;
            System.out.println("Success!");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("move on because i'm always executed");


        }
    }
}