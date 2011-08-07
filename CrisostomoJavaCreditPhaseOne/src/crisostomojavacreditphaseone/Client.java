/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphaseone;
import java.io.*;
import java.text.DecimalFormat;
import java.util.Date;

/**
 *
 * @author arscariosus
 */
public class Client {
    /**
     * @param args the command line arguments
     */
    public static int displayMenu() throws Exception {
        BufferedReader choice = new BufferedReader(new InputStreamReader(System.in));
        Date today = new Date();
        System.out.println(today);
        System.out.println("\t\tMain Menu");
        System.out.println("\t[1] New Credit Account");
        System.out.println("\t[2] Credit Inquiry");
        System.out.println("\t[3] Purchases");
        System.out.println("\t[4] Payment");
        System.out.println("\t[5] Close Credit Account");
        System.out.println("\t[6] Exit");
        System.out.print("\nPlease enter your choice : ");
        return Integer.parseInt(choice.readLine());
    }

    public static boolean createNewCreditAcct(Credit ca) throws Exception {
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double annualIncome;

        System.out.print("Please enter annual income : ");
        annualIncome = Double.parseDouble(input.readLine());

        if(annualIncome < 300000 && annualIncome >= 200000)
            ca.setCreditLimit(30000);
        else if(annualIncome >= 300000 && annualIncome <= 500000)
            ca.setCreditLimit(50000);
        else if(annualIncome > 500000)
            ca.setCreditLimit(100000);
        else {
            System.out.println("Annual income is too low.");
            return false;
        }
        ca.setCreditAcctNo((int) (Math.random() * 9999) + 1000);

        //display new account information
        System.out.println("Congratulations, your account has been created!");
        System.out.println("Account Number : " + ca.getCreditAcctNo());
        System.out.println("Credit Limit : " + formatter.format(ca.getCreditLimit()));
        return true;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Credit ca = new Credit();
        boolean accountExist = false;

        for(int choice = displayMenu(); choice != 6; choice = displayMenu()){
            if(accountExist == false) {
                switch(choice) {
                    case 1: 
                            if(createNewCreditAcct(ca))
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
                            if(ca.validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                ca.creditInquiry();
                            } else {
                                System.out.println("Invalid or incorrect account number. Please try again.");
                            }
                            break;

                    case 3: System.out.print("Enter your account number : ");
                            if(ca.validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                System.out.print("Please enter the amount : ");
                                ca.purchase(Double.parseDouble(input.readLine()));
                            } else {
                                System.out.println("Invalid or incorrect account number. Please try again.");
                            }
                            break;

                    case 4: System.out.print("Enter your account number : ");
                            if(ca.validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                System.out.print("Please enter the amount : ");
                                ca.payBalance(Double.parseDouble(input.readLine()));
                            } else {
                                System.out.println("Invalid or incorrect account number. Please try again.");
                            }
                            break;

                    case 5: System.out.print("Enter your account number : ");
                            if(ca.validateCreditAccount(Integer.parseInt(input.readLine()))) {
                                System.out.print("Are you sure you want to delete your account (yes/no) ? ");
                                String str = input.readLine();
                                if(str.equals("yes")) {
                                    ca.setCreditAcctNo(0);
                                    ca.setCreditBalance(0);
                                    ca.setCreditLimit(0);
                                    accountExist = false;
                                    System.out.println("Account has been successfully terminated.");
                                 } else {
                                    System.out.println("Invalid or incorrect account number. Please try again.");
                                }
                                break;
                        } else {
                                break;
                        }
                        

                    case 6: break;
                        
                    default: System.out.println("Invalid input. Please try again."); break;
                }
            }
        }
    }
}


