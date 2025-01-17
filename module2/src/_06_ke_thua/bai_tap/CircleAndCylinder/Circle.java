package _06_ke_thua.bai_tap.CircleAndCylinder;

public class Circle {
    private double radius;
    private String color;

    Circle(double radius){
    }

    public Circle(double radius, String color){
        this.radius = radius;
        this.color = color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "Area=" + getArea() +
                ", Perimeter=" + getPerimeter() +
                ", radius=" + getRadius() +
                ", color='" + getColor() + '\'' +
                '}';
    }
}
