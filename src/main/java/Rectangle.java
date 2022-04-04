public class Rectangle extends Figure
{
 private Point upperLeft;
 private Point upperRight;

 public Rectangle(Point p1, Point p2)
 {
  this.upperLeft = p1;
  this.upperRight = p2;
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
