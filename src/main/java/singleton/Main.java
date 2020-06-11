package singleton;

public class Main {
    public static void main(String[] args) {
        Hospital doc;

        doc = Hospital.getInstance();

        doc.getTreatment();
    }
}
