/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomojavacreditphaseone;
import java.io.*;

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
        System.out.println("\tJava Bank Main Menu");
        System.out.println("[1] New Credit Account");
        System.out.println("[2] Credit Inquiry");
        System.out.println("[3] Purchases");
        System.out.println("[4] Payment");
        System.out.println("[5] Close Credit Account");
        System.out.println("[6] Exit");
        System.out.print("\nPlease enter your choice : ");
        return Integer.parseInt(choice.readLine());
    }

    public static void createNewCreditAcct(Credit ca) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        double annualIncome;

        System.out.print("Please enter annual income : ");
        annualIncome = Double.parseDouble(input.readLine());

        if(annualIncome>=299999 && annualIncome <= 200000)
            ca.setCreditLimit(30000);
        else if(annualIncome == 300000)
            ca.setCreditLimit(50000);
        else
            ca.setCreditLimit(100000);

        ca.setCreditAcctNo((int) (Math.random() * 9999) + 1000);

        //display new account information
        System.out.println("Congratulations, your account has been created!");
        System.out.println("Account Number : " + ca.getCreditAcctNo());
        System.out.println("Credit Limit : " + ca.getCreditLimit());
    }

    public static void main(String[] args) throws Exception {
        boolean accountExist = false;

        for(int choice = displayMenu(); choice != 6; choice = displayMenu()){
            if(accountExist == false) {
                switch(choice) {
                    case 1: Credit ca = new Credit();
                            createNewCreditAcct(ca);
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
                            break;

                    case 3: break;

                    case 4: break;

                    case 5: break;

                    case 6: break;
                        
                    default: System.out.println("Invalid input. Please try again."); break;
                }
            }
        }
    }
}


