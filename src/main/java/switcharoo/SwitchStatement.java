package switcharoo;

public class SwitchStatement {
    public static void main(String[] args) {
        int Month = 5;
        String month;

        switch (Month) {
            case 1:
                month = "January";
                break;
            case 2:
                month = "February";
                break;
            case 3:
                month = "March";
                break;
            case 4:
                month = "April";
                break;


            case 5:
                month = "May";
                break;
            case 6:
                month = "June";
                break;
            case 7:
                month = "July";
                break;
            default:
                month = "Not a month";
                break;
        }
        System.out.println("The month is " + month);

    }
}
