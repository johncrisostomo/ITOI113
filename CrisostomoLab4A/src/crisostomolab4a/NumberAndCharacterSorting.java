/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package crisostomolab4a;
import java.io.*;
/**
 *
 * @author arscariosus
 */
public class NumberAndCharacterSorting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        	BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
	String uinput;
	int i, j;
	char tmp;


	System.out.print("Enter input : ");
	uinput = input.readLine();

	char inputchar[] = new char[uinput.length()];

	for(int x = 0; x < uinput.length(); x++) {
	    inputchar[x] = uinput.charAt(x);
	}

	for(i = 0; i < uinput.length()-1; i++) {
	    for(j = i+1;j < uinput.length(); j++) {
		if(inputchar[j] < inputchar[j-1]) {
			tmp = inputchar[j];
			inputchar[j] = inputchar[j-1];
			inputchar[j-1] =tmp;
		}
	    }
	}

	for(int x = uinput.length()-1; x >= 0; x--){
	    System.out.print(inputchar[x]);
	}
	System.out.println();
    }

}
