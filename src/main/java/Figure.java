public abstract class Figure
{
    private Color color;

    public Color getColor()
    {
        return color;
    }

    public void setColor(Color c)
    {
        color = c;
    }

    public abstract double area();
    public abstract double perimeter();

}