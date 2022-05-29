public class Account {
    private int accNumb;
    private String Fname;
    private String type;
    private String balance;
    private int interest;


    public Account(int accNumb, String Fname, String type, String balance, double interest) {
        this.accNumb = accNumb;
        this.Fname = Fname;
        this.type = type;
        this.balance = balance;
        this.interest = (int) interest;
    }

    public int getAccNumb() {
        return accNumb;
    }

    public String getFname() {
        return Fname;
    }

    public String getType() {
        return type;
    }
    public String getBalance() {
        return balance;
    }
    public int getInterest() {
        return interest;
    }

    public String toString() {
        return accNumb +"\t"+ Fname+"\t"+type+"\t"+balance+"\t"+interest;
    }
}