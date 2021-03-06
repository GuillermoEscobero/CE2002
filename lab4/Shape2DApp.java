import java.util.Scanner;

public class Shape2DApp {
    public static void main(String args[]) {
        int numberOfShapes;
        Shape[] shapes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Total number of shapes: ");
        numberOfShapes = sc.nextInt();

        shapes = new Shape[numberOfShapes];

        for(int i = 0; i < numberOfShapes; i++) {
            System.out.println("Type of shape?");
            System.out.println("1) Square");
            System.out.println("2) Rectangle");
            System.out.println("3) Circle");
            System.out.println("4) Triangle");
            System.out.print("> ");

            int type = sc.nextInt();

            double arg1, arg2;
            switch(type) {
                case 1:
                    System.out.print("Side: ");
                    arg1 = sc.nextDouble();
                    shapes[i] = new Square(0, 0, arg1);
                    break;
                case 2:
                    System.out.print("Height: ");
                    arg1 = sc.nextDouble();
                    System.out.print("Base: ");
                    arg2 = sc.nextDouble();
                    shapes[i] = new Rectangle(0, 0, arg1, arg2);
                    break;
                case 3:
                    System.out.print("Radius: ");
                    arg1 = sc.nextDouble();
                    shapes[i] = new Circle(0, 0, arg1);
                    break;
                case 4:
                    System.out.print("Height: ");
                    arg1 = sc.nextDouble();
                    System.out.print("Base: ");
                    arg2 = sc.nextDouble();
                    shapes[i] = new Triangle(0, 0, arg1, arg2);
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
            break;
        }

    }
}
