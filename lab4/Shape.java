abstract class Shape {
    private int x;
    private int y;

    Shape(int x, int y) {
        moveTo(x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    void moveTo(int x, int y) {
        setX(x);
        setY(y);
    }

    abstract double calculateArea();
    abstract double calculateVolume();
}
