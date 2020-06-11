package anonymous;

public class Polygon {
    public void display() {
        System.out.println("this is a anonymous class demo, whatchu know bout that?");
    }
}

class AnonDemo {
    public void createClass() {

        Polygon poly1 = new Polygon() {
            public void display() {
                System.out.println("an anonymous class is inside of another class");
            }
        };
        poly1.display();
    }
}
