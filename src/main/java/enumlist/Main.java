package enumlist;

import java.util.EnumSet;

public class Main {
    enum DogSize {
        POMERANIAN, BOXER, MASTIFF, GREATDANE
    }

    public static void main(String[] args) {

        // Creating an EnumSet using allOf()
        EnumSet<DogSize> sizes = EnumSet.allOf(DogSize.class);

        System.out.println("EnumSet: " + sizes);
    }

}
