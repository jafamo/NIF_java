/**
* Detect word of DNI
* @author jafamo
*/

import java.util.Locale;
import java.util.Scanner;

import javax.swing.JOptionPane;


public class DNI {
	
	static Scanner t = new Scanner(System.in).useLocale(Locale.US);
    
	/*
	 * Method main call SearchDNI();
	 */
	public static void main(String args[]){	
		SearchDNI();
	}
	
	
	/*
	 * Not required parameters
	 * This method need a number 8 length() and calculated word of DNI
	 */
	public static void SearchDNI(){
		 String abe[]={"T","R","W","A","G","M","Y","F","P","D","X","B","N","J","Z","S","Q","V","H","L","C","K","E"};
		    String x;
		   
		x=JOptionPane.showInputDialog("Write your number (DNI) for to know word");
	     
	     //your number of DNI = 8 characters
	     if((x.length()<8) || (x.length()>8))
	   	  JOptionPane.showMessageDialog(null,"Error, your number is wrong","Your NIF", JOptionPane.WARNING_MESSAGE);
	     
	     //if your number is 8 characters
	     else
	     {
	       int dni=Integer.parseInt(x);          
	       int numero = dni%23;
	       
	       JOptionPane.showMessageDialog(null,"Your DNI is : " +dni+ "-"+abe[numero],"calculo letra NIF",JOptionPane.INFORMATION_MESSAGE);
	     }
	
	}//end method
     
}//END Class

