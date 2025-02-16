package lab2tasque1.lab2tasque1_1;

public class Junior extends Approver{
    @Override
    protected boolean canApprove(int amount) {
        return -1 < amount && amount <= 1;
    }
    @Override
    protected void approve(int amount) {
        System.out.println("Approving " + amount + " by a Junior");
    }
}
