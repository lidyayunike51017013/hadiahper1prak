/**
 * @(#)konversiwaktu.java
 *
 *
 * @author 
 * @version 1.00 2019/9/18
 */

import java.util.Scanner;
public class konversiwaktu {

    public static void main (String [] args) {
    	int jam;
    	int menit;
    	int detik;
    	int tot;
    Scanner input = new Scanner (System.in);
    
    System.out.print ("Jam : ");
    	jam = input.nextInt();
    System.out.print ("menit : ");
    	menit = input.nextInt ();
    
    tot = (jam*3600)+(menit*60);
    
    System.out.println ("total detik : "+tot);
      System.out.println ("detik");
    }
    
    
}

