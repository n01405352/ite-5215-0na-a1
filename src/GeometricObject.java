abstract class GeometricObject {

    private String color = "white";
    private boolean filled = false;

    // no-arg
    public GeometricObject() {
    }

    // overloaded constructor
    protected GeometricObject(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    // getters and setters
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean getFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    // abstract methods
    public abstract double getArea();

    public abstract double getPerimeter();


}