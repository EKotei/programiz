package singleton;

public class Hospital {
    // class type field, which refers to object of class.
    private static Hospital doctor;

    private Hospital() {
    }
    //returns the instance of the class to the outside world.
    public static Hospital getInstance() {

        if(doctor == null) {
            doctor = new Hospital();
        }
        return doctor;
    }
    public void getTreatment() {
        System.out.println("The doctor is now administering anesthesia.");
    }
}
