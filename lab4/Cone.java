class Cone extends Circle {
    private double height;

    Cone(int x, int y, double radius, double height) {
        super(x, y, radius);
        this.height = height;
    }

    public double calculateArea() {
        return super.calculateArea() + Math.PI * Math.sqrt(height*height + getRadius()*getRadius());
    }


}
