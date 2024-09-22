public abstract class AbstractShape implements Shape {
    public String color;
    public double length;
    public double width;
    public double radius;

public AbstractShape(String color, double length, double width) {
    this.color = color;
    this.length = length;
    this.width = width;
}
}