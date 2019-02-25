class Triangle extends Shape {
    private double height;
    private double base;

    Triangle(int x, int y, double height, double base) {
        super(x, y);
        setHeight(height);
        setBase(base);
    }

    public double getHeight() {
        return height;
    }

    public double getBase() {
        return base;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double calculateArea() {
        return base * height / 2;
    }


}
