public class comp2 extends company{
    public comp2(int deposit, int withdraw) {
        super(deposit, withdraw);
    }

    public comp2(int deposit) {
        super(deposit);
    }

    public comp2() {

    }


    public static int interestRate(){
        return 2;
    }
    int history(){
        return deposit - withdraw;
    }
}
