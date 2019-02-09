public class PlaneSeat {
  private int seatId;
  private boolean assigned;
  private int customerId;

  public PlaneSeat(int seatId) {
    this.seatId = seatId;
    this.assigned = false;
    this.customerId = -1;
  }

  public int getSeatId() {
    return this.seatId;
  }

  public int getCustomerId() {
    return this.customerId;
  }

  public boolean isOccupied() {
    return this.assigned;
  }

  public void assign(int cust_id) {
    this.customerId = cust_id;
    this.assigned = true;
  }

  public void unAssign() {
    this.customerId = -1;
    this.assigned = false;
  }


}
