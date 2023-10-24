public class TermDeposit {
    private double amountDeposit;
    private double locatePercent;
    private int locateTime;

    public TermDeposit(double amountDeposit, double locatePercent, int locateTime) {
        this.amountDeposit = amountDeposit;
        this.locatePercent = locatePercent;
        this.locateTime = locateTime;
    }
    public double locateResult(){

        return amountDeposit *(1+  locatePercent/100 * locateTime/12);
    }
}
