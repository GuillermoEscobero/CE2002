import java.util.Scanner;

public class PlaneApp {
  public static void main(String[] args) {

    Plane plane = new Plane();

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
          plane.showNumEmptySeats();
          break;
        case 2:
          plane.showEmptySeats();
          break;
        case 3:
          plane.showAssignedSeats(true);
          break;
        case 4:
          plane.showAssignedSeats(false);
          break;
        case 5:
          System.out.println("\tAssigning Seat...");
          System.out.print("\t\tPlease enter SeatID: ");
          arg1 = sc.nextInt();
          System.out.print("\t\tPlease enter Customer ID: ");
          arg2 = sc.nextInt();
          plane.assignSeat(arg1, arg2);
          break;
        case 6:
          System.out.print("\t\tEnter SeatID to unassign customer from: ");
          arg1 = sc.nextInt();
          plane.unAssignSeat(arg1);
          break;
        case 7:
          break;
      }

      System.out.println();
      System.out.println();

    } while (choice < 7);

  }
}
