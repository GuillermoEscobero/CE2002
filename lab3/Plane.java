import java.util.Comparator;
import java.util.Arrays;

public class Plane {
  private PlaneSeat[] seat;
  private int numEmptySeat;

  public Plane() {
    this.seat = new PlaneSeat[12];
    for (int i = 0; i < this.seat.length; i++) {
      this.seat[i] = new PlaneSeat(i+1);
    }
    this.numEmptySeat = 12;
  }

  class SortByCustomerID implements Comparator<PlaneSeat> {
    public int compare(PlaneSeat a, PlaneSeat b) {
      if (a.getCustomerId() < b.getCustomerId()) return -1;
      else if (a.getCustomerId() == b.getCustomerId()) return 0;
      else return 1;
    }
  }

  private PlaneSeat[] sortSeats() {
    PlaneSeat[] sorted = this.seat.clone();
    Arrays.sort(sorted, new SortByCustomerID());

    return sorted;
  }

  public void showNumEmptySeats() {
    System.out.println("\tThere are " + this.numEmptySeat + " empty seats");
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
    System.out.println("\tThe seat assignments are as follow:");
    PlaneSeat[] sorted;

    if (!bySeatId) {
      sorted = sortSeats();
    } else {
      sorted = this.seat;
    }

    for (int i = 0; i < sorted.length; i++) {
      if (sorted[i].isOccupied()) {
        System.out.println("\tSeatID "+ sorted[i].getSeatId() + " assigned to Customer ID " + sorted[i].getCustomerId() + ".");
      }
    }
  }

  public void assignSeat(int seatId, int cust_id) {
    if (this.seat[seatId-1].isOccupied()) {
      System.out.println("\tSeat already assigned to a customer.");
      return;
    } else {
      this.seat[seatId-1].assign(cust_id);
      this.numEmptySeat--;
      System.out.println("\tSeat Assigned!");
    }
  }

  public void unAssignSeat(int seatId) {
    if (this.seat[seatId-1].isOccupied()) {
      this.seat[seatId-1].unAssign();
      this.numEmptySeat++;
    }

    System.out.println("\tSeat Unassigned!");
  }
}
