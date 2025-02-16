package lab2tasque1.lab2tasque1_1;

public class ApproverFactory {
    public ApproverFactory () {}
    public Approver getApprover(String approverType) {
        switch (approverType) {
            case "J":
                return new Junior();
            case "S":
                return new Senior();
            case "M":
                return new Manager();
        }
        return null;
    }
}
