package brk;

public class BreakDaLoop {
        public static void main(String[] args) {

            // for loop
            for (int i = 12; i >= 2; --i) {

                //if the value of i is 5 the loop terminates
                if (i == 5) {
                    break;
                }
                System.out.println(i);
            }
        }
    }


