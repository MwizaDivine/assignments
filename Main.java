import java.util.ArrayList;
import java.util.List;

public class Main {
        public static void main(String[] args) {
                List<Account> accList = new ArrayList<>();
                accList.add(new Account(11, "MARK", "Checking", "10000","0.1"));
                accList.add(new Account(12, "DERA", "Credit", "20000","0.2"));
                accList.add(new Account(13, "ALAIN", "credit", "30000","0.3"));
                accList.add(new Account(14, "ME", "Saving", "40000","0.4"));
                accList.add(new Account(15, "BIKORA", "Debit", "50000","0.7"));
                accList.add(new Account(16, "BEBE", "Debit", "60000","0.5"));
                accList.add(new Account(17, "HI", "Credit", "70000","0.6"));
                accList.add(new Account(18, "BRIGHT", "Debit", "80000","0.7"));
                accList.add(new Account(19, "MANZI", "Debit", "90000","0.8"));
                accList.add(new Account(20, "MANZI", "Saving", "990000","0.9"));



                for (Account acc:accList){
                        System.out.println(acc);
                }
        }
}