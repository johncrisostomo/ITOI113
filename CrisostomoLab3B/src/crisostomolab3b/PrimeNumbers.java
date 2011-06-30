/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab3b;
import java.io.*;

/**
 *
 * @author arscariosus
 */
public class PrimeNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	int a, b, hit = -1;
	int choice;
	String confirm;
	char answer = 'y';

	menu:
	do {
	    System.out.println("\t\t\tMENU");
	    System.out.println("[1]\tPrime or Composite");
	    System.out.println("[2]\tAll Prime Numbers");
	    System.out.println("[3]\tExit");
	    System.out.print("Enter your choice : ");
	    choice = Integer.parseInt(input.readLine());

	    switch(choice) {
	    case 1: System.out.print("Please enter a number : ");
		a = Integer.parseInt(input.readLine());
		for(int i = 2;i < a; i++) {
		    if(a % i == 0) {
			hit = 1;
		    }
		}
		if(hit < 0) {
		    System.out.println(a + " is a prime number.");
		} else {
		    System.out.println(a + " is a composite number.");
		}
		hit = -1;
		break;

	    case 2: System.out.print("Please enter the first number : ");
		a = Integer.parseInt(input.readLine());
		System.out.print("Please enter the second number : ");
		b = Integer.parseInt(input.readLine());
		if (a > b) {
		    int temp = a;
		    a = b;
		    b = temp;
		}
		System.out.print("Prime numbers between " + a + " and " + b + " are : ");
		for(int i = a; i <= b; i++) {
		    for(int j = 2; j < i; j++) {
			if(i % j == 0) hit = 1;
		    }
		    if(hit < 0 && i >= -1 && i != 1 && i != 0) System.out.print(i + " ");
		    hit = -1;
		}
		System.out.println();
		break;
	    case 3: System.out.print("Are you sure? (yes/no)");
		confirm = input.readLine();
		if(confirm.equals("yes"))
		    break menu;
		else
		    continue menu;
	    default: System.out.println("Invalid input!");
	    }

	    System.out.print("Would you like to try another?");
	    answer = (char) System.in.read();
	    System.in.read();
	}while(answer == 'y');
    }
}
