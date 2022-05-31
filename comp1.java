public class comp1 extends company{
    public comp1(int deposit, int withdraw) {
        super(deposit);
    }

    public comp1() {
        //super(deposit);
    }

    public static int interestRate(){
        return 2;
    }
    int history(){
        return deposit - withdraw;
    }
}