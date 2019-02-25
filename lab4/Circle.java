class Circle extends Shape {
    private double radius;

    Circle(int x, int y, double radius) {
        super(x, y);
        setRadius(radius);
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double calculateArea() {
        return Math.PI * Math.pow(radius, 2);
    }


}
