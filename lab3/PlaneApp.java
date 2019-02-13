import java.util.Scanner;

public class PlaneApp {
  public static void main(String[] args) {
    int choice;
    int arg1, arg2;
    Scanner sc = new Scanner(System.in);

    do {
      System.out.println("(1) Show number of empty seats");
      System.out.println("(2) Show the list of empty seats");
      System.out.println("(3) Show the list of seat assignments by seat ID");
      System.out.println("(4) Show the list of seat assignments by customer ID");
      System.out.println("(5) Assign a customer to a seat");
      System.out.println("(6) Remove a seat assignment");
      System.out.println("(7) Exit");

      System.out.println();

      System.out.print("\t\tEnter the number of your choice: ");

      choice = sc.nextInt();

      switch (choice) {
        case 1:

          break;
        case 2:
          break;
        case 3:
          break;
        case 4:
          break;
        case 5:
          System.out.println("\tAssigning Seat...");
          System.out.print("\t\tPlease enter SeatID: ");
          arg1 = sc.nextInt();
          System.out.print("\t\tPlease enter Customer ID: ");
          arg2 = sc.nextInt();
          System.out.println();
          break;
        case 6:
          break;
        case 7:
          break;
      }

    } while (choice < 7);

  }
}
