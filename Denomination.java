/*
 * Created by Crisostomo, John Dominic S. (2007-10993)
 *  on June 15, 2011, 11:05am
 * E-mail: jscrisostomo@feu-eac.edu.ph
 */

import java.io.*;

public class Denomination {
    public static void main(String args[]) throws Exception  {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	int amount, sum = 0, counter = 0;
	int[] denominations = {1000, 500, 200, 100, 50, 20, 10, 5, 1};
	int[] answer = {0, 0, 0, 0, 0, 0, 0, 0, 0};
	System.out.print("Please enter the amount : ");
	amount = Integer.parseInt(br.readLine());
	
	while(sum != amount) {
	    if((denominations[counter]+sum)<= amount){
		answer[counter]++;
		sum = sum + denominations[counter];
	    } else {
		 counter++;
	    }
	}
	for(int i = 0; i < answer.length; i++) {
	    System.out.printf("%4d : %d\n", denominations[i], answer[i]);
	}
    }
}