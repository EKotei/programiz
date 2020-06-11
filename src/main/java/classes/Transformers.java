package classes;

public class Transformers {
    private String name;
    private String transform;

    public Transformers(String name, String transform) {
        this.name = name;
        this.transform = transform;
    }

    public Transformers() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTransform() {
        return transform;
    }

    public void setTransform(String transform) {
        this.transform = transform;
    }

    @Override
    public String toString() {
        return "Transformers{" +
                "name='" + name + '\'' +
                ", transform='" + transform + '\'' +
                '}';
    }

}
