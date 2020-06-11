package nested;

public class Number {
    public static void main(String[] args) {
        Double points1 = 5.0, points2 = 6.0, points3 = 7.5, total;

        if (points3 >= points1) {

            if (points2 >= points2) {
                total = points3;
            } else {
                total = points1;
            }

        } else {
            total = points2;
        }
        System.out.println("The total number of points is " + points3);
    }
}