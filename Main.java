

import java.util.Scanner;

public class Main {
        Scanner scan = new Scanner(System.in);
        String ch;
        int deposit;
        int withdraw;
        //int history;

        public static void main(String[] args) {
                company comp = new company(6, 7);

                System.out.println("history: comp.history");
                Scanner scan = new Scanner(System.in);
                scan = new Scanner(System.in);
                String ch;
               int deposit;
                int withdraw;
                int history;


                do{
                        System.out.print("1. Company 1\n2. Company 2\n3. Company 3\n Choose your company: ");
                        ch=scan.nextLine();
                        System.out.print("amount to deposit: ");
                        deposit= Integer.parseInt(scan.nextLine());
                        System.out.print("enter amount to withdraw: ");
                        withdraw= Integer.parseInt(scan.nextLine());
                        switch (ch) {
                                case "1" -> {
                                        System.out.println("This is company 1\n");
                                        company company = new comp1();
                                        System.out.println("Company's interest is: "+company.interestRate());
                                        System.out.println("The minimum duration is 3years");
                                }
                                case "2" -> {
                                        System.out.println("This is company 2\n");
                                        company company = new comp2();
                                        System.out.println("Company's interest is: "+company.interestRate());
                                        System.out.println("The minimum duration is 4years");
                                }

                                case "3" -> {
                                        System.out.println("This is company 3\n");
                                        company company = new comp3();
                                        System.out.println("Company's interest is: "+company.interestRate());
                                        System.out.println("The minimum duration is 1years");
                                }

                        }


                }while(!ch.equals("0"));
        }
}