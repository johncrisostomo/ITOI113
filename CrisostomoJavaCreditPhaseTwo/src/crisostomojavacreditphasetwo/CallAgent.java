/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphasetwo;
import java.io.*;
import java.util.Date;
import java.text.DecimalFormat;

/**
 *
 * @author arscariosus
 */
public class CallAgent {
    public static int displayMenu() throws Exception {
        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        Date today = new Date();
        System.out.println(today);
        System.out.println("\t\tMain Menu");
        System.out.println("\t[1] New Credit Account");
        System.out.println("\t[2] Credit Inquiry");
        System.out.println("\t[3] Purchases");
        System.out.println("\t[4] Payment");
        System.out.println("\t[5] Client Profile");
        System.out.println("\t[6] Close Credit Account");
        System.out.println("\t[7] Exit");
        System.out.print("\nPlease enter your choice : ");
        return Integer.parseInt(choice.readLine());
    }

    public static boolean createAcct(Client cl) throws Exception {
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double annualIncome;

        TravelCredit tc = new TravelCredit();
        cl.setTc(tc);

        System.out.print("Please enter your name : ");
        cl.setName(input.readLine());
        System.out.print("Please enter your address : ");
        cl.setAddress(input.readLine());
        System.out.print("Please enter your birthday : ");
        cl.setBday(input.readLine());
        System.out.print("Please enter your contact : ");
        cl.setContact(Integer.parseInt(input.readLine()));
        System.out.print("Please enter annual income : ");
        annualIncome = Double.parseDouble(input.readLine());

        if(annualIncome < 300000 && annualIncome >= 200000)
            cl.getTc().setCreditLimit(30000);
        else if(annualIncome >= 300000 && annualIncome <= 500000)
            cl.getTc().setCreditLimit(50000);
        else if(annualIncome > 500000)
            cl.getTc().setCreditLimit(100000);
        else {
            System.out.println("Annual income is too low.");
            return false;
        }
        cl.getTc().setCreditAcctNo((int) (Math.random() * 9999) + 1000);

        //display new account information
        System.out.println("Congratulations, your account has been created!");
        System.out.println("Account Number : " + cl.getTc().getCreditAcctNo());
        System.out.println("Credit Limit : " + formatter.format(cl.getTc().getCreditLimit()));
        return true;
    }
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Client cl = new Client();
        boolean accountExist = false;

        for(int choice = displayMenu(); choice != 6; choice = displayMenu()){
            if(accountExist == false) {
                switch(choice) {
                    case 1:
                            if(createAcct(cl))
                                accountExist = true;
                            break;

                    case 6: break;

                    default: System.out.println("You have to create an account first!");
                }
            } else {
                switch(choice) {
                    case 1: System.out.println("You already have an account!");
                            break;

                    case 2:
                            System.out.print("Enter your account number : ");
                            if(cl.getTc().validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                cl.getTc().creditInquiry();
                            } else {
                                System.out.println("Invalid or incorrect account number. Please try again.");
                            }
                            break;

                    case 3: System.out.print("Enter your account number : ");
                            if(cl.getTc().validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                System.out.print("Please enter the amount : ");
                                cl.getTc().purchase(Double.parseDouble(input.readLine()));
                            } else {
                                System.out.println("Invalid or incorrect account number. Please try again.");
                            }
                            break;

                    case 4: System.out.print("Enter your account number : ");
                            if(cl.getTc().validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                System.out.print("Please enter the amount : ");
                                cl.getTc().payBalance(Double.parseDouble(input.readLine()));
                            } else {
                                System.out.println("Invalid or incorrect account number. Please try again.");
                            }
                            break;

                    case 5: System.out.print("Enter your account number : ");
                            if(cl.getTc().validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                System.out.println(cl);
                            } else {
                                System.out.println("Invalid or incorrect account number. Please try again.");
                            }
                            break;

                    case 6: System.out.print("Enter your account number : ");
                            if(cl.getTc().validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                System.out.print("Are you sure you want to delete your account (yes/no) ? ");
                                String str = input.readLine();
                                if(str.equals("yes")) {
                                    cl.getTc().setCreditAcctNo(0);
                                    cl.getTc().setCreditBalance(0);
                                    cl.getTc().setCreditLimit(0);
                                    accountExist = false;
                                    System.out.println("Account has been successfully terminated.");
                                 } else {
                                    System.out.println("Invalid or incorrect account number. Please try again.");
                                }
                                break;
                        } else {
                                break;
                        }


                    
                    case 7: break;
                    default: System.out.println("Invalid input. Please try again."); break;
                }
            }
        }
    }

}
