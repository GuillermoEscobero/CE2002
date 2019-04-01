class Square extends Shape {
    private double side;

    Square(int x, int y, double side) {
        super(x, y);
        setSide(side);
    }

    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    public double calculateArea() {
        return side*side;
    }

    public double calculateVolume() {
      return 0;
    }


}
