public class Plane {
  private PlaneSeat[] seat;
  private int numEmptySeat;

  public Plane() {
    this.seat = new PlaneSeat[12];
    this.numEmptySeat = 12;
  }

  public PlaneSeat[] sortSeats() {
    return null;
  }

  public void showNumEmptySeats() {
    System.out.println("Empty Seats: " + this.numEmptySeat);
  }

  public void showEmptySeats() {
    System.out.println("List of empty seats");
    System.out.println("****************************");
    System.out.println("Seat ID\tCustomer ID");

    for (int i = 0; i < this.seat.length; i++) {
      if (!seat[i].isOccupied()) {
        System.out.println("Seat No. " + seat[i].getSeatId());
      }
    }
  }

  public void showAssignedSeats(boolean bySeatId) {
    System.out.println("List of assigned seats");
    System.out.println("****************************");
    System.out.println("Seat ID\tCustomer ID");

    // TODO: ORDER THE ARRAY HERE

    for (int i = 0; i < this.seat.length; i++) {
      if (seat[i].isOccupied()) {
        System.out.println(seat[i].getSeatId()+ "\t" + seat[i].getCustomerId());
      }
    }
  }

  public void assignSeat(int seatId, int cust_id) {

  }
}
