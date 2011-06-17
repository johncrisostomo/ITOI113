/*
 * Created by Crisostomo, John Dominic S. (2007 - 10993)
 *   on June 17, 2011 ( 10:17am)
 *
 *  E-mail : jscrisostomo@feu-eac.edu.ph
 */

// formula :  
// mg = 60% cs + me
// cs = 40% lq + 30% sq + 25% r + 5% te

import java.io.*;
import java.text.*;

public class GradesComputation {
    public static void main(String args[]) throws Exception {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	DecimalFormat formatter = new DecimalFormat("00.00");
	float sq, lq, r, te, me;
	float cs, mg;
	System.out.print("Enter grade for Short Quiz : ");
	sq = Float.parseFloat(br.readLine());
	System.out.print("Enter grade for Long Quiz : ");
	lq = Float.parseFloat(br.readLine());
	System.out.print("Enter grade for Recitation : ");
	r = Float.parseFloat(br.readLine());
	System.out.print("Enter grade for Teacher's Evaluation : ");
	te = Float.parseFloat(br.readLine());
	System.out.print("Enter grade for Midterm Exam : " );
	me = Float.parseFloat(br.readLine());
	
	cs = (lq * .40) + (sq * .30) + (r * .25) + (te * .05);
	mg = (cs * .60) + (me * .40);

	System.out.println("The grade is " + formatter.format(mg));
    }
}