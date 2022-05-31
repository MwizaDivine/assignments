public class comp3 extends company{
    public comp3(int deposit, int withdraw) {
        super(deposit, withdraw);
    }

    public comp3(int deposit) {
        super(deposit);
    }

    public comp3() {
        super();
    }

    public static int interestRate(){
        return 2;
    }
    int history(){
        return deposit - withdraw;
    }
}
