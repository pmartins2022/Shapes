public class Rectangle extends Figure
{
 private Point upperLeft;
 private Point bottomRight;

 public Rectangle(Point p1, Point p2)
 {
  this.upperLeft = p1;
  this.bottomRight = p2;
 }

 @Override
 public double area()
 {

  return Math.abs(bottomRight.getX()- upperLeft.getX()) * Math.abs(bottomRight.getY()- upperLeft.getY());
 }

 @Override
 public double perimeter()
 {
  return Math.abs (upperLeft.getY ()- bottomRight.getY ())*2+Math.abs (upperLeft.getX ())- bottomRight.getX ()*2;
 }
}
