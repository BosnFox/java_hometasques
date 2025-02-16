package lab2tasque1.lab2tasque1_1;

abstract class Approver {
    protected Approver NextApprover;

    public void setNextApprover(Approver nextApprover) {
        this.NextApprover = nextApprover;
    }
    public void processRequest(int amount) {
        if (canApprove(amount)) {
            approve(amount);
        } else if (this.NextApprover != null) {
            this.NextApprover.processRequest(amount);
        } else {
            System.out.println("Declined code " + amount + ": unknown or unsolvable");
        }
    }
    protected abstract boolean canApprove(int amount);
    protected abstract void approve(int amount);
}
