public class Circle implements Shape{

    private final double radius;

    public Circle(double radius){
        this.radius=radius;
    }

    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getCircumference() {
        return 2*Math.PI*radius;
    }
}
