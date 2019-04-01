class Rectangle extends Shape {
    private double width;
    private double height;

    Rectangle(int x, int y, double width, double height) {
        super(x, y);
        setWidth(width);
        setHeight(height);
    }

    public double getWidth() {
        return width;
    }

    public double getHeight() {
        return height;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double calculateArea() {
        return height*width;
    }

    public double calculateVolume() {
      return 0;
    }


}
