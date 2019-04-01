class Pyramid extends Triangle {
  public Pyramid(double base, double height) {
    super(0, 0, base, height);
  }

  public double calculateVolume() {
    return calculateArea()*getBase()/3;
  }

  public double calculateArea() {
    double len = 0.5 * getBase();
    double aux = Math.sqrt(getHeight()*getHeight() + Math.pow(len, 2));
    return Math.pow(getBase(), 2) + aux * getBase()*0.5*4;
  }
}
