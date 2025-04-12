package org.Reynard_de_Bosnie.lab2tasque1.lab2tasque1_1;

public class Senior extends Approver {
    @Override
    protected boolean canApprove(int amount) {
        return -1 < amount && amount <= 2;
    }
    @Override
    protected void approve(int amount) {
        System.out.println("Approving " + amount + " by a Senior");
    }
}
