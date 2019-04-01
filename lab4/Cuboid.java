public class Cuboid extends Rectangle {
  private double height;

  public Cuboid(double length, double breadth, double height) {
    super(0, 0, length, breadth);
    this.height = height;
  }

  public double calculateVolume() {
    return calculateArea() * height;
  }

  public double calculateArea() {
    return (super.calculateArea() + (height*getHeight()) + (height*getWidth()))*3;
  }
}
