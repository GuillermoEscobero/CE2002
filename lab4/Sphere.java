class Sphere extends Circle {

    Sphere(double radius) {
        super(0, 0, radius);
    }

    public double calculateArea() {
        return 4 * Math.PI * Math.pow(super.getRadius(), 2);
    }


}
