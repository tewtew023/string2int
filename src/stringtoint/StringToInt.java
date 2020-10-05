package stringtoint;

import java.util.Scanner;

public class StringToInt {

	public StringToInt() {
		// TODO Auto-generated constructor stub
	}

	private static int intOutput;
	static int output = 0;
	public static void main(String[] args) {
		

		Scanner strSC = new Scanner(System.in);
		String strInput;

		System.out.print("Enter String : ");
		strInput = strSC.nextLine();
		detectInt(strInput);
		System.out.print("Your Integer is : "+output);

	}

	static void detectInt(String strInput) {
		char character;
		char allNumber[] = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
		String onlyIntStr = "";
		for ( int i=0;i<strInput.length();i++) {
			character = strInput.charAt(i);
			for(int ii=0;ii<10;ii++) {
			if(character==allNumber[ii]) {
				onlyIntStr+=character;	
			}

			}
			
		}
		toInteger(onlyIntStr);
		

	}
	 static void toInteger(String onlyIntStr) {

		 int digit=1;
		 for(int i=onlyIntStr.length();i>0;i--) {
			 output += (onlyIntStr.charAt(i-1)-'0')*digit;
			 digit*=10;
		 }
	 }

}

