public class Cylinder extends Circle {
  public double height;

  public Cylinder(double radius, double height) {
    super(0, 0, radius);
    this.height = height;
  }

  public double calculateVolume() {
    return calculateArea()* height;
  }

  public double calculateArea() {
    double curved = Math.PI * 2 * getRadius();
    return curved + super.calculateArea();
  }
}
