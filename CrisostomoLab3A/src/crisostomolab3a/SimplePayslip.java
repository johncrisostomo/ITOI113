/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package crisostomolab3a;
import java.io.*;
import java.util.*;
import java.text.*;

/**
 *
 * @author arscariosus
 */
public class SimplePayslip {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        DecimalFormat formatter = new DecimalFormat("##,##0.00");
        Date today = new Date();
        
        // variable declaration
        int number;
        String name;
        double salary;
        double ot;
        
        // prompts and inputs
        System.out.println("Employee Payslip");
        System.out.print("Enter Employee Number : ");
        number = Integer.parseInt(input.readLine());
        System.out.print("Enter Employee Name : ");
        name = input.readLine();
        System.out.print("Enter Employee's Basic Salary : ");
        salary = Double.parseDouble(input.readLine());
        System.out.print("Enter Employee's OT Hours : ");
        ot = Double.parseDouble(input.readLine()); 
        
        // prints payslip
    }
}
