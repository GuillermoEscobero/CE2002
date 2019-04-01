import java.util.Scanner;

public class Shape3DApp {
    public static void main(String args[]) {
        int numberOfShapes;
        Shape[] shapes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Total number of shapes: ");
        numberOfShapes = sc.nextInt();

        shapes = new Shape[numberOfShapes];

        for(int i = 0; i < numberOfShapes; i++) {
          System.out.println();
            System.out.println("Type of shape?");
            System.out.println("1) Cone");
            System.out.println("2) Cylinder");
            System.out.println("3) Sphere");
            System.out.print("> ");

            int type = sc.nextInt();

            double arg1, arg2, arg3;
            switch(type) {
                case 1:
                    System.out.print("Base: ");
                    arg1 = sc.nextDouble();
                    System.out.print("Height: ");
                    arg2 = sc.nextDouble();
                    shapes[i] = new Pyramid(arg1, arg2);
                    break;
                case 2:
                    System.out.print("Length: ");
                    arg1 = sc.nextDouble();
                    System.out.print("Breadth: ");
                    arg2 = sc.nextDouble();
                    System.out.print("Height: ");
                    arg3 = sc.nextDouble();
                    shapes[i] = new Cuboid(arg1, arg2, arg3);
                    break;
                case 3:
                    System.out.print("Radius: ");
                    arg1 = sc.nextDouble();
                    shapes[i] = new Sphere(arg1);
                    break;
                default:
                    break;
            }
        }

        int choice;
        System.out.println("(1) Calculate area");
        System.out.println("(2) Calculate volume");

        choice = sc.nextInt();


        switch (choice) {
          case 1:
            double totalArea = 0;
            for (int i = 0; i < shapes.length; i++) {
              totalArea += shapes[i].calculateArea();
            }
            System.out.println("TOTAL AREA: " + totalArea);
            break;
          case 2:
          double totalVolume = 0;
          for (int i = 0; i < shapes.length; i++) {
            totalVolume += shapes[i].calculateVolume();
          }
          System.out.println("TOTAL VOLUME: " + totalVolume);
          break;
        }

    }
}
