package stringtoint;

import java.util.Scanner;

public class StringToInt {

	public StringToInt() {
		// TODO Auto-generated constructor stub
	}

	static int outPutInt;
	static char strChar;

	public static void main(String[] args) {

		Scanner strSC = new Scanner(System.in);
		String strInput;

		System.out.print("Enter String : ");
		strInput = strSC.nextLine();

		int digit = digitCount(strInput);
       System.out.print(toInt(digit,strInput));

	}

	public static int digitCount(String strInput) {

		boolean isDigit;
		int strLenght = strInput.length();
		int digit = 0;
		for (int i = 0; i < strLenght; i++) {
			strChar = strInput.charAt(i);
			if (Character.isDigit(strChar)) {
				digit++;
			}

		}

		return digit;

	}

	public static int toInt(int digit, String strInput) {
		boolean isDigit;
		int outPut=0;
		int outPut2=0;
		int strLenght = strInput.length();
		for (int i = 0; i < strLenght; i++) {
			strChar = strInput.charAt(i);
			if (Character.isDigit(strChar)) {
				outPut = (strChar - '0');
				outPut=(int) (outPut*(Math.pow(10,digit-1)));
			//	outPut=outPut*(10^digit);
				System.out.println(outPut);
				digit--;

			 outPut2+=outPut;
			}
			

		}
		return outPut2;

		

	}

}
