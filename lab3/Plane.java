public class Plane {
  private PlaneSeat[] seat;
  private int numEmptySeat;

  public Plane() {
    this.seat = new PlaneSeat[12];
    this.numEmptySeat = 12;
  }

  private PlaneSeat[] sortSeats() {
    PlaneSeat[] sorted = new PlaneSeat[12];
    return null;
  }

  public void showNumEmptySeats() {
    System.out.println("There are " + this.numEmptySeat + " empty seats");
  }

  public void showEmptySeats() {
    System.out.println("\tThe following seats are empty:");
    for (int i = 0; i < this.seat.length; i++) {
      if (!seat[i].isOccupied()) {
        System.out.println("\tSeatID " + seat[i].getSeatId());
      }
    }
  }

  public void showAssignedSeats(boolean bySeatId) {
    System.out.println("The seat assignments are as follow:");
    PlaneSeat[] sorted;

    if (!bySeatId) {
      sorted = sortSeats();
    }

    for (int i = 0; i < this.seat.length; i++) {
      if (seat[i].isOccupied()) {
        System.out.println("SeatID "+ seat[i].getSeatId() + "assigned to Customer ID " + seat[i].getCustomerId());
      }
    }
  }

  public void assignSeat(int seatId, int cust_id) {
    System.out.println("\tAssigning Seat...");
  }

  public void unAssignSeat(int seatId) {

  }
}
