public class company {
    int deposit;
    int withdraw;

    public company(int deposit, int withdraw) {
        this.deposit = deposit;
        this.withdraw = withdraw;
    }

    public company(int deposit) {
        this.deposit = deposit;
        this.withdraw= deposit;
    }

    public company() {

    }

    public static int interestRate() {
        return 1;
    }
int history(){
    return deposit - withdraw;
}
}