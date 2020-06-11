package enumeration;

enum Clothing {
    EXTRASMALL, SMALL, MEDIUM, LARGE, EXTRALARGE
}

class Clothes {
    Clothing shirtSize;
    public Clothes(Clothing shirtSize) {
        this.shirtSize = shirtSize;
    }
    public void buyShirts() {
        switch(shirtSize) {
            case EXTRASMALL:
                System.out.println("I bought an extra small shirt... smh");
                break;
            case SMALL:
                System.out.println("I bought a shirt that doesn't fit");
                break;
            case MEDIUM:
                System.out.println("I guess this medium fits alright");
                break;
            case LARGE:
                System.out.println("I feel like an early 2000's back up dancer in this jawn");
                break;
            case EXTRALARGE:
                System.out.println("Yeaaaa... no");
                break;
        }
        class Test {
            public void main(String[] args) {

                }
            }
        }
    }



