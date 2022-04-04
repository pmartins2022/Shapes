public class Circle extends Figure
{
    private Point center;
    private double radius;

    public Circle (Point center, double radius)
    {
        this.center = center;
        this.radius = radius;
    }

    public double getRadius ()
    {
        return radius;
    }

    public void setRadius (double radius)
    {
        this.radius = radius;
    }

    public void expand(double scaleFactor)
    {
        setRadius (getRadius ()*scaleFactor);
    }

    @Override
    public double area()
    {
        return 0;
    }

    @Override
    public double perimeter()
    {
        return 0;
    }
}
